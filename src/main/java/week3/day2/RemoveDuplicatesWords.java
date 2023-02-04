package week3.day2;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "We learn java basics as part of java sessions in java week1";
		String[] words = text.split(" ");
		String output = "";
		Set<String> set = new HashSet<String>();
		for(String str: words) {
			boolean add = set.add(str);
			if (add)
				output = output+str+" ";
		}
		System.out.println(output);
	}

}
