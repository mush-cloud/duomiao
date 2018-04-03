package duomiao;

import org.junit.Test;


public class RedisTest {
	
	@Test
	public void testR() {
		String  json1,json2;
		json1 = "11";
		json2 = "22";
      String str = "{\"pauseRange\":"+json1+",\"item\":"+json2+"}";
      System.err.println(str);
	}

}
