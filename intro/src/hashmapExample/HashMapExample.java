package hashmapExample;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
	public static void main(String[] args) {
		HashMap<String, String> myHash = new HashMap<>();
		myHash.put("one", "Mangoes");
		myHash.put("two",  "Papayas");
		myHash.put("three", "Apples");
		
		for(Map.Entry e:myHash.entrySet()) {
			 System.out.println(e.getKey()+". "+e.getValue());  
			
		}
	}
}
