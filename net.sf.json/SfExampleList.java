package net.sef.jsonExample;

import java.util.ArrayList;
import java.util.List;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class SfExampleList {

	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		List<Person> list = new ArrayList<Person>();
		list.add(new Person("xie", "male", 35));
		list.add(new Person("li", "female", 123));
		
		JSONArray jsonArray = JSONArray.fromObject(list);
		System.out.println("jsonArray : " + jsonArray);
		
		String msg =  "[{'age':35,'car':null,'name':'xie','sex':'male'},{'age':123,'car':null,'name':'li','sex':'female'}]";
		JSONArray jsonArray2 = JSONArray.fromObject(msg);
		
	/*	for(int i = 0; i < jsonArray2.size(); i++){
			JSONObject job = jsonArray2.getJSONObject(i);
			Person person = (Person) JSONObject.toBean(job, Person.class);
			System.out.println("person.sex : " + person.getSex());
		}
		
		//已过时，被toCollection替代
		List list2 = JSONArray.toList(jsonArray2);
		for(Object ob : list2){
			JSONObject job = JSONObject.fromObject(ob);
			Person person = (Person) JSONObject.toBean(job, Person.class);
			System.out.println("person.name : " + person.getName());
		}
		
		
		//已过时，被toCollection替代
		List<Person> list3 = JSONArray.toList(jsonArray2, Person.class);
		for(Person person : list3){
			System.out.println("person.age : " + person.getAge());
		}*/
		
		//SONArray转换成list
		List<Person> list4 = (List<Person>) JSONArray.toCollection(jsonArray2, Person.class);
		for(Person person : list4){
			System.out.println("person.name : " + person.getName());
		}
		
		//JSONArray转换成数组
		Person[] persons = (Person[]) JSONArray.toArray(jsonArray2, Person.class);
		for(int i = 0; i < persons.length; i++){
			System.out.println("name = " + persons[i].getName());
		}
		
		boolean[] flags = new boolean[]{true, false, true, false, false};
		JSONArray jsonArray3 = JSONArray.fromObject(flags);
		System.out.println("jsonArray3 : " + jsonArray3);
		Object[] cc = (Object[]) JSONArray.toArray(jsonArray3);
		for(int i = 0; i < cc.length; i++){
			System.out.println("jsonArray3 : " + cc[i]);
		}
	}
}
