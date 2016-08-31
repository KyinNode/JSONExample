package net.sef.jsonExample;

import net.sf.json.JSONObject;

public class SfExampleJavaBean {

	public static void main(String[] args) {

		// json��ʽ�ַ���ת��json
		String personMsg = "{'name' : 'alice', 'sex' : 'female'}";
		JSONObject json = JSONObject.fromObject(personMsg);
		System.out.println("String transfer to json : " + json);

		// jsonת����javaBean
		Person alice = (Person) JSONObject.toBean(json, Person.class);
		System.out.println("json transfer to javaBean : " + alice);

		// javabeanת��json
		json = JSONObject.fromObject(alice);
		System.out.println("javaBean transfer to json : " + json);
		
		/*json.elementOpt("name", "asdfasdf");
		System.out.println("json : " + json);*/
		
		System.out.println("class = " + json.optString("class"));
		
		System.out.println("age = " + json.optInt("age"));
		
		System.out.println("flag = " + json.optBoolean("flag"));
		
		
		
	}
}
