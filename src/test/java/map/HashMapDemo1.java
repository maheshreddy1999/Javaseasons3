package map;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo1 {

	public static void main(String[] args) {
	
		Map<Integer,String> hMap=new HashMap<Integer,String>();
		
		System.out.println(hMap.size()); //0
		
		hMap.put(100, "ravi");
		hMap.put(101, "gopi");
		hMap.put(102, "kiran");
		hMap.put(103, "mahesh");
		System.out.println(hMap.size()); //4
		
		System.out.println(hMap);
		
		
	}

}
