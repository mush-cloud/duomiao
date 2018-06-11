package duomiao;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.util.AbstractCollection;
import java.util.Map;

public class Abs {
	public static void main(String[] args){
		String objectStr="{\"name\":\"JSON\",\"age\":\"24\",\"address\":\"北京市西城区\"}";
		JSONObject jsonObject = JSONObject.parseObject(objectStr);
		Student student = new Student();
		student.setName("json");
		student.setAddress("上海");
		student.setAge(23);
		String x = JSON.toJSONString(student);
		JSONObject jsonObject1 = JSONObject.parseObject(x);
		Student stu =JSON.toJavaObject(jsonObject1,Student.class);
		/*JSONArray jsonArray= JSONArray.parseArray(objectStr);*/
		System.out.println(stu);
	}

}
