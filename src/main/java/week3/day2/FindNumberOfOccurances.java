package week3.day2;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class FindNumberOfOccurances {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = {2,3,5,6,3,2,1,4,2,1,6,-1};
		Map<Integer, Integer> map = new TreeMap<Integer, Integer>();
		for(int num : input) {
			if(map.containsKey(num)) {
				int integer = map.get(num);
				map.put(num, integer+1);
			}
			else
				map.put(num, 1);
		}
		System.out.println(map);
		Set<Entry<Integer, Integer>> entrySet = map.entrySet();
		for(Entry<Integer, Integer> entry: entrySet) {
			System.out.println(entry.getKey()+"->"+entry.getValue());
		}
	}

}
