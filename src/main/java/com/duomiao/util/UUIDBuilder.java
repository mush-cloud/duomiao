package com.duomiao.util;

import java.util.UUID;

public class UUIDBuilder {
     public static String createUUID() {
    	 String uuid = UUID.randomUUID().toString();
    	 uuid = uuid.replace("-", "");
    	 return uuid;
     }
}
