package com.duomiao.control;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.duomiao.service.RedisCacheUtil;

@Controller
public class RedisControl {
	@RequestMapping("/chk")
	@ResponseBody
      public String setRedis(String key,String value) {
    	  RedisCacheUtil rcu = new RedisCacheUtil("111");
    	  rcu.putObject(key, value);
    	  System.err.println(rcu.getObject(key));
    	  RedisCacheUtil rcu2 = new RedisCacheUtil("222");
    	  System.err.println(rcu2.getObject(key)+"ID：222");
    	  return "success";
}
	@RequestMapping("/japan")
      public String toRedis() {
		System.err.println("jianlaile");
    	return "NewFile";
}
}
