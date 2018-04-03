package com.duomiao.service;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.apache.ibatis.cache.Cache;
import org.junit.Test;
import org.mybatis.caches.redis.SerializeUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.connection.jedis.JedisConnection;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.stereotype.Service;

import redis.clients.jedis.exceptions.JedisConnectionException;

/*
 * 使用第三方缓存服务器，处理二级缓存
 */
public class RedisCacheUtil implements Cache {
	// 日志记录器
	private static Logger logger = LoggerFactory.getLogger(RedisCacheUtil.class);
	private final ReadWriteLock readWriteLock = new ReentrantReadWriteLock();
	private String id;
	private static JedisConnectionFactory jedisConnectionFactory;
	public RedisCacheUtil(String id) {
		if (id == null) {
			throw new IllegalArgumentException("Cache instances require an ID");
		}
		logger.debug("---------------------Mybatis RedisCache:id=" + id + "---------------------");
		this.id = id;
	}

	/**
	 * 清除所有数据
	 */
	@Override
	public void clear() {
		JedisConnection connection = null;
		try {
			connection = (JedisConnection) jedisConnectionFactory.getConnection();
			connection.flushAll();
		} catch (JedisConnectionException e) {
			e.printStackTrace();
		} finally {
			if (connection != null) {
				connection.close();
			}
		}

	}

	@Override
	public String getId() {
		// TODO Auto-generated method stub
		return this.id;
	}

	/**
	 * 得到key对应的value
	 */
	@Override
	public Object getObject(Object key) {

		Object result = null;
		JedisConnection connection = null;
		try {
			connection = (JedisConnection) jedisConnectionFactory.getConnection();
			// 对象序列化成字符串存入redis，取对应key的value值时需要反序列化成对象
			result = SerializeUtil.unserialize(connection.get(SerializeUtil.serialize(key)));
			// result =
			// SerializeUtil.unserialize(connection.hGet(RedisCache.this.id.toString().getBytes(),
			// key.toString().getBytes()));
		} catch (JedisConnectionException e) {
			e.printStackTrace();
		} finally {
			if (connection != null) {
				connection.close();
			}
		}
		return result;
	}

	@Override
	public ReadWriteLock getReadWriteLock() {
		return this.readWriteLock;
	}

	/**
	 * 返回当前key的数量
	 */
	@Override
	public int getSize() {
		int result = 0;
		JedisConnection connection = null;
		try {
			connection = (JedisConnection) jedisConnectionFactory.getConnection();
			result = Integer.valueOf(connection.dbSize().toString());
			// result =
			// Integer.valueOf(connection.hGetAll(RedisCache.this.id.toString().getBytes()).size());
		} catch (JedisConnectionException e) {
			e.printStackTrace();
		} finally {
			if (connection != null) {
				connection.close();
			}
		}
		return result;
	}

	@Override
	public void putObject(Object key, Object value) {
		JedisConnection connection = null;
		try {
			logger.debug("------------------Redis Put Object:" + key.toString() + ":" + value.toString()
					+ "-------------------");
			connection = (JedisConnection) jedisConnectionFactory.getConnection();
			connection.set(SerializeUtil.serialize(key), SerializeUtil.serialize(value));
			connection.append(SerializeUtil.serialize(key), SerializeUtil.serialize(value));
			// connection.hSet(RedisCache.this.id.toString().getBytes(),key.toString().getBytes(),SerializeUtil.serialize(value));
		} catch (JedisConnectionException e) {
			e.printStackTrace();
		} finally {
			if (connection != null) {
				connection.close();
			}
		}

	}

	@Override
	public Object removeObject(Object key) {
		JedisConnection connection = null;
		Object result = null;
		try {
			connection = (JedisConnection) jedisConnectionFactory.getConnection();
			result = connection.expire(SerializeUtil.serialize(key), 0);// 设置过期时间，时间到期后自动删除
			// 或者 result = connection.del(SerializeUtil.serialize(key));
			// result =
			// connection.hDel(RedisCache.this.id.toString().getBytes(),key.toString().getBytes());
		} catch (JedisConnectionException e) {
			e.printStackTrace();
		} finally {
			if (connection != null) {
				connection.close();
			}
		}
		return result;
	}

	/**
	 * 静态注入jedisConnectionFactory
	 * 所解决的问题:
	 * @param jedisConnectionFactory
	 */
	public static void setJedisConnectionFactory(JedisConnectionFactory jedisConnectionFactory) {
		RedisCacheUtil.jedisConnectionFactory = jedisConnectionFactory;
	}
	/*@Autowired
	public  void setJedisConnectionFactory(JedisConnectionFactory jedisConnectionFactory) {
		this.jedisConnectionFactory = jedisConnectionFactory;
		System.err.println(this.jedisConnectionFactory+"ssssssssss");
	}
	public JedisConnectionFactory getJedisConnectionFactory() {
		return jedisConnectionFactory;
	}*/

}
