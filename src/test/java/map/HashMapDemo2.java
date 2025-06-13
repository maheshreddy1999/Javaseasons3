package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo2 {

	public static void main(String[] args) {
	
		Map<String, String> hMap=new HashMap<String,String>();
		
		System.out.println(hMap.size()); //0
		
		hMap.put("manager", "ravi");
		hMap.put("test lead", "gopi");
		hMap.put("developer", "kiran");
		hMap.put("lead", "mahesh");
		System.out.println(hMap.size()); //4
		
		System.out.println(hMap);
		
		Set<Entry<String, String>> entries=hMap.entrySet();
		
		for(Entry<String, String> entry:entries) { 
			System.out.println(entry.getKey()+" is  	"+entry.getValue());
		
		
		}
		}
		
		
	
}
