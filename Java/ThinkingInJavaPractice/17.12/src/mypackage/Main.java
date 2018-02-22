package mypackage;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Map<String, String> hashmap=new HashMap<String,String>();
		Map<String, String> treemap=new TreeMap<String,String>();
		Map<String, String> linkedhashmap=new LinkedHashMap<String,String>();
		
		hashmap.put("Sky", "Blue");
		treemap.put("Grass", "Green");
		linkedhashmap.put("Ocean", "Dancing");
		System.out.println(hashmap);
		System.out.println(treemap);
		System.out.println(linkedhashmap);

	}

}
