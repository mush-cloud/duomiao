package com.duomiao.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateHelper {
			//通用时间格式化  返回Date  参数date
		public static Date getFormatDate(String pattern,Date date ) {
			SimpleDateFormat sdf = new SimpleDateFormat(pattern);
			String s = sdf.format(date);
			try {
				date = sdf.parse(s);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return date;
		}
	
}

