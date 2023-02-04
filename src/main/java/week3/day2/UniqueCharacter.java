package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class UniqueCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "google";
		String output = "";
		Set<Character> unique = new LinkedHashSet<Character>();
		char[] charVal = str.toCharArray();
		for(char ch: charVal) {
			boolean add = unique.add(ch);
			if(add)
				output = output + ch;
		}
		System.out.println(output);
	}

}
