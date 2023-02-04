package week3.day2;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FindOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		String name = "amazon development centre";
		char[] charArray = name.toCharArray();
		
		//Iterating each character and Map
		for(char ch : charArray) {
			if(map.containsKey(ch)) {
				int count = map.get(ch);
				count++;
				map.put(ch, count);
			}
			else
				map.put(ch, 1);
		}
		Set<Entry<Character, Integer>> entrySet = map.entrySet();
		
		for(Entry<Character, Integer> entry: entrySet) {
			System.out.println(entry.getKey() + " => "+ entry.getValue());
		}
	}

}
