package net.sef.jsonExample;

import net.sf.json.JSON;
import net.sf.json.JSONObject;
import net.sf.json.xml.XMLSerializer;

public class SfExampleXML {
	
	public static void main(String[] args) {
		 String xmlStr = "<root>" +
		 				"<name type='String'>zhangsanfeng</name>"+
		 				"<sex>male</sex>"+
		 				"<age>100</age>"+
		 				"<birthday>"+
		 					"<year>2016</year>"+
		 					"<month>8</month>"+
		 					"<day>8</day>"+
		 				"</birthday>"+
		 				"</root>";
		 XMLSerializer xmlSerializer = new XMLSerializer();
		 JSON json = xmlSerializer.read(xmlStr);
		 System.out.println("json : " + json.toString());
		 
		 String jsonStr = "{'root':{'name':'zhangsanfeng','sex':'male','age':'100','birthday':{'year':'2016','month':'8','day':'8'}}}";
		 JSONObject jsonObject = JSONObject.fromObject(jsonStr);
		 XMLSerializer sz = new XMLSerializer();
		 String xmls = sz.write(jsonObject);
		 System.out.println("xml = " + xmls);
		 
		 
	}

}
