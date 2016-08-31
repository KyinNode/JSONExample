package net.sef.jsonExample;

import net.sf.json.JSONObject;

public class SfExample2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		JSONObject json = new JSONObject();
		System.out.println("json : " + json);
		
		Object ob = json.put("color", "red");
		System.out.println("ob: " + ob);
		System.out.println("json after put: " + json);
		
		json.put("color", "black");
		System.out.println("ob: " + ob);
		System.out.println("json after put: " + json);
		
	}

}
