package com.duomiao.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;

import com.duomiao.service.RedisCacheUtil;

/**
 * 描述:为RedisCacheUtil静态注入JedisConnecionFactory而创建的第三方工具类（目的节约开销和成本）
 * @author WuKun
 *
 */
public class RedisCacheTransfer {
	 @Autowired
	    public  void setJedisConnectionFactory(JedisConnectionFactory jedisConnectionFactory) {
	     RedisCacheUtil.setJedisConnectionFactory(jedisConnectionFactory);
	    }
}
