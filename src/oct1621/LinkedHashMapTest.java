package oct1621;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapTest {

	public static void main(String[] args) {
		Map<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();

		linkedHashMap.put(1, new String("Apple"));
		linkedHashMap.put(2, new String("Banana"));
		linkedHashMap.put(3, new String("Orange"));
		linkedHashMap.put(4, new String("Papaya"));
		linkedHashMap.put(5, new String("Mango"));
		linkedHashMap.put(6, new String("Grapes"));

		System.out.println("List of fruits : " + linkedHashMap);

		for (Integer key : linkedHashMap.keySet()) {
			System.out.println(key + ":\t" + linkedHashMap.get(key));
		}
		
		System.out.println("LinkedHashMap contains Banana as value? : " + linkedHashMap.containsValue("Banana"));
		System.out.println("\nLinkedHashMap retrieve Apple? : " + linkedHashMap.get(1));

		ArrayList<String> list = new ArrayList<String>(linkedHashMap.values());
		Collections.sort(list);
		System.out.println(list);

		linkedHashMap.clear();
		System.out.println("\nContent of LinkedHashMap after clearing: " + linkedHashMap);

	}
}
