package week3.day2;

import java.util.HashSet;
import java.util.Set;

public class PrintUniqueCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "babu";
		String output = "";
		char[] charArray = str.toCharArray();
		Set<Character> set = new HashSet<Character>();
		for(char ch : charArray) {
			boolean add = set.add(ch);
			if(!add)
				set.remove(ch);
				
		}
		for(char c : set){
			output = output+c;
		}
		System.out.println(output);
	}

}
