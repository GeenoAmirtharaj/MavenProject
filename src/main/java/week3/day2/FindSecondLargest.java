package week3.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindSecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = {3,2,11,4,6,7,2,3,3,6,7};
		Set<Integer> set = new TreeSet<Integer>();
		for(int val: data) {
			set.add(val);
		}
		List<Integer> list = new ArrayList<Integer>(set);
		System.out.println("Output 2nd largest is: "+list.get(list.size()-2));
	}
}
