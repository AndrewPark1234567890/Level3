package FINAL;

import java.util.ArrayList;
import java.util.HashMap;

public class HashMapCalculator {

	public int commonKeyValuePairs(HashMap<String, String> hashmap1, HashMap<String, String> hashmap2) {
		int notUnique = 0;
		for (String name1 : hashmap1.keySet()) {
			for (String name2 : hashmap2.keySet()) {
				if (name2.equals(name1)) {
					System.out.println("name same");
					if (hashmap1.get(name1).equals(hashmap2.get(name2))) {
						System.out.println("char same");
						notUnique++;
					}
				}
			}
		}
		System.out.println(notUnique);
		return notUnique;
	}

}
