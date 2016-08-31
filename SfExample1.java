package net.sef.jsonExample;

import java.util.HashMap;
import java.util.Map;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class SfExample1 {

	public static void main(String[] args) {
/*		JSONObject json = new JSONObject();

		boolean isArray = json.isArray();
		boolean isEmpty = json.isEmpty();
		boolean isNullObject = json.isNullObject();
		System.out.println("是否为数组: " + isArray + " 是否为空：" + isEmpty + " 是否为空对象：" + isNullObject); // json的一些判断

		//新增属性
		json.put("name", "lio");
		json.put("age", 26);
		json.put("sex", "男");
		System.out.println("json: " + json);

		// 新增属性
		json.element("heigh", 170); 
		System.out.println("json: " + json);

		 //根据key返回值
		System.out.println("json: " + json.get("heigh"));

		
		// json的一些判断
		isArray = json.isArray();
		isEmpty = json.isEmpty();
		isNullObject = json.isNullObject();
		System.out.println("是否为数组: " + isArray + " 是否为空：" + isEmpty + " 是否为空对象：" + isNullObject);
		
		JSONArray jsonArray = new JSONArray();
		Person person1 = new Person("alice","女");
		Car car = new Car("粤B52342",person1);
		Person person = new Person("alex","男", car);
		jsonArray.add(0, person);
		jsonArray.add(1, "red");
		
		System.out.println("the 0 : " + jsonArray.get(0));
		json.put("student", jsonArray);
		
		jsonArray = null;
		jsonArray = new JSONArray();
		jsonArray.add("asfasdf");
		jsonArray.add("123123");
		
		json.element("fff", jsonArray);
		
		System.out.println("json: " + json);
		
		json.accumulate("eee", 123);
		
		System.out.println("json: " + json);
		
		JSONObject json2 = new JSONObject();
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("one", 1);
		map.put("two", 2);
		map.put("three", 3);
		json2.accumulateAll(map);
		System.out.println("json2 : " + json2);
		
		
		JSONObject json3 = new JSONObject();
		json3.put("red", "fly");
		System.out.println("json3 : " + json3);
		
		json3.accumulate("red", 1);
		System.out.println("json3 : " + json3);
		
		json3.element("red", false);
		System.out.println("json3 : " + json3);
		
		String a = null;
		json3.element("red", a);
		System.out.println("json3 : " + json3);
		*/
		
		/*JSONArray jsonArray2 = new JSONArray();
		JSONObject json4 = new JSONObject();
		JSONObject json5 = new JSONObject();
		json4.put("one", "red");
		json5.put("two", "black");
		jsonArray2.add(json4);
		jsonArray2.add(json5);
		System.out.println("jsonArray2 : " + jsonArray2);
		*/
		JSONObject json6 = new JSONObject();
	/*	json6.put("three", jsonArray2);
		System.out.println("json6 : " + json6);*/
		json6.accumulate("three", "yellow");
		System.out.println("json6 : " + json6);
		String a = null;
		json6.element("three", a);
		System.out.println("json6 : " + json6);
		
		
		
		/*String ex = "[{\"one\":\"red\"},{\"two\":\"black\"}]";
		JSONArray jsonArray = JSONArray.fromObject(ex);
		System.out.println(jsonArray.toString());*/
	}

}
