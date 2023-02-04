package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class FindMostDuplicateNumber {

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
		List<Integer> values = new ArrayList<Integer>(map.values());
		Collections.sort(values);
		Set<Entry<Character, Integer>> entrySet = map.entrySet();
		for(Entry<Character, Integer> entry : entrySet) {
			if(entry.getValue() == values.get(values.size()-1))
				System.out.println("Max Duplicated character is: "+ entry.getKey());
		}
	}

}
