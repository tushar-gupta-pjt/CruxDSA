package lecture_42;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.TreeMap;

public class HashMap_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String, Integer> map = new HashMap<>();
		
		map.put("Raj", 98);
		map.put("Anku",77);
		map.put("Kunal",45);
		map.put("Ms", 42);
		map.put("Virat", 35);
		map.put("KL", 31);
		map.put("Gaikwad",28);
		System.out.println(map);
		// get 
		System.out.println(map.get("Ms"));
		System.out.println(map.get("Raina"));
		//Contains key
		System.out.println(map.containsKey("Ms"));
		System.out.println(map.containsKey("Raina"));
		//remove
		System.out.println(map.remove("Kunal"));
		System.out.println(map.get("Rahul"));
		//size
		System.out.println(map.size());
		
		TreeMap<String, Integer> map1 = new TreeMap<>();
		map1.put("Raj", 98);
		map1.put("Anku",77);
		map1.put("Kunal",45);
		map1.put("Ms", 42);
		map1.put("Virat", 35);
		map1.put("KL", 31);
		map1.put("Gaikwad",28);
		System.out.println(map1);
		
		LinkedHashMap<String, Integer> map2 = new LinkedHashMap<>();
		map2.put("Raj", 98);
		map2.put("Anku",77);
		map2.put("Kunal",45);
		map2.put("Ms", 42);
		map2.put("Virat", 35);
		map2.put("KL", 31);
		map2.put("Gaikwad",28);
		System.out.println(map2);
		
		//loop in map
		
//		Set<String> s = map2.keySet();
//		for(String key:s) {
//			System.out.println(key+" "+map2.get(key));
//		}
		
		for(String key:map2.keySet()) {
			System.out.println(key+" "+map2.get(key));
		}
		
		
		
	}

}
