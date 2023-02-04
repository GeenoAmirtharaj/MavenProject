package week3.day2;

import java.util.Set;
import java.util.TreeSet;

public class SortingUsingCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] company = {"Wipro", "HCL" , "Aspire Systems","CTS"};
		Set<String> set = new TreeSet<String>();
		for(String str: company) {
			set.add(str);
		}
		Object[] array = set.toArray();
		for(int i= array.length-1 ; i>=0; i--) {
			if(i!=0)
				System.out.print(array[i]+ ", ");
			else
				System.out.print(array[i]);
		}
			
	}

}
