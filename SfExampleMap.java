package net.sef.jsonExample;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import net.sf.json.JSONObject;

public class SfExampleMap {

	public static void main(String[] args) {
		
		String msg = "{'firstPerson':{'age':12,'car':null,'name':'alex','sex':'male'},'secondPerson':{'age':13,'car':null,'name':'alice','sex':'female'}}";
		Map map = JSONObject.fromObject(msg);
		String firstPersonStr = map.get("firstPerson").toString();
		System.out.println("firstPerson.name = " + firstPersonStr);
		
		JSONObject jj = JSONObject.fromObject(map.get("secondPerson"));
		Person sp = (Person)JSONObject.toBean(jj, Person.class);
		System.out.println(" sp : " + sp.getSex());
		
		Set set = map.keySet();
		Iterator iter = set.iterator();
		Map<String, Person> theTureMap = new HashMap<String, Person>();
		int i = 0;
		while(iter.hasNext()){
			String key = iter.next().toString();
			JSONObject json = JSONObject.fromObject(map.get(key));
			Object ob = JSONObject.toBean(json);
			System.out.println("ob : " + ob.toString());
			Person theOne = (Person)JSONObject.toBean(json, Person.class);
			System.out.println(" person.name : " + theOne.getName());
			theTureMap.put("a"+i, theOne);
			i++;
		}
		System.out.println("map : " + map);
		
		JSONObject jsonMap = JSONObject.fromObject(theTureMap);
		System.out.println("jsonMap = " + jsonMap);
		
	}
}
