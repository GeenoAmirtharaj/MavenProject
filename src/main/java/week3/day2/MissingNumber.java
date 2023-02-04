package week3.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = {10, 5, 4, 1, 3, 9, 6, 8, 7};
		Set<Integer> set = new TreeSet<Integer>();
		for(int val: num) {
			set.add(val);
		}
		List<Integer> list = new ArrayList<Integer>(set);
		int findMiss = list.get(0);
		for(int i = 1; i < list.size(); i++) {
			int val = list.get(i);
			boolean result = (val == findMiss+1)? true : false ;
			findMiss = val;
			if (result) 
				continue; 
			else { 
				System.out.println("Missing number is "+ (findMiss-1)); 
				break; 
			}
		}
	}

}
