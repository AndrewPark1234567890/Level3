package FINAL;

import java.util.ArrayList;
import java.util.HashMap;

public class HashMapCalculator {

	public int commonKeyValuePairs(HashMap<String, String> hashmap1, HashMap<String, String> hashmap2) {
		int notUnique = 0;
		ArrayList<String> names = new ArrayList<String>();
		ArrayList<String> checks = new ArrayList<String>();
		for(String s: hashmap1.keySet()){
			names.add(s);
		}for(String s: hashmap2.keySet()){
			names.add(s);
		}
		for (String f: names) {
		for (String s: names) {
			if(s.equals(f)){
				checks.add(s);
			}
		}
		}
		return notUnique;
	}

}
