package net.sef.jsonExample;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.sf.json.JSONObject;

public class SfExampleVO {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		List<Car> list = new ArrayList<Car>();
		list.add(new Car("����", 100000));
		list.add(new Car("����", 80000));
		list.add(new Car("��������", 950000));
		
		List<Person> students = new ArrayList<Person>();
		students.add(new Person("alex", "male", 25, list.get(0)));
		students.add(new Person("alice", "female", 18, list.get(1)));
		students.add(new Person("seven", "male", 32, list.get(2)));
		
		List<Teacher> teachers = new ArrayList<Teacher>();
		teachers.add(new Teacher("MissMa" , 30000, "male", 10));
		teachers.add(new Teacher("MissLee" , 4000, "female", 3));
		
		Book book = new Book("������", 13);
		
		Classes theClass = new Classes();
		theClass.setClassName("����һ��");
		theClass.setStudent(students);
		theClass.setTeachers(teachers);
		theClass.setBook(book);
		System.out.println("theClass : " + theClass);
		JSONObject jsonObject = JSONObject.fromObject(theClass);
		System.out.println("the class msg: " + jsonObject);
		
		
		String msg = "{'book':{'tname':'��ѧ','price':100},'className':'����һ��','student':[{'age':25,'car':{'carNum':'����','price':100000},'name':'alex','sex':'male'},{'age':18,'car':{'carNum':'����','price':80000},'name':'alice','sex':'female'},{'age':32,'car':{'carNum':'��������','price':950000},'name':'seven','sex':'male'}],'teachers':[{'name':'MissMa','salary':30000,'sex':'male','workAge':10},{'name':'MissLee','salary':4000,'sex':'female','workAge':3}]}";
		
		JSONObject json = JSONObject.fromObject(msg);
		Classes tc = (Classes) JSONObject.toBean(json, Classes.class);
		System.out.println("tc : " + tc);
		
		System.out.println("bookName : " + tc.getBook().getTname());
		
		JSONObject ob = JSONObject.fromObject(tc);
		System.out.println("ob = " + ob.toString());
		
		
		JSONObject json2 = JSONObject.fromObject(msg);
		Map<String, Class> map = new HashMap<String, Class>();
		map.put("teachers", Teacher.class);
		map.put("student", Person.class);
		map.put("book", Book.class);
		Classes tc2 = (Classes) JSONObject.toBean(json2, Classes.class, map);
		System.out.println("tc2 = " + tc2);
		
	}
}
