package week1.day1;

public class PrintOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 1; i<=20 ; i++ ) {
			if(i%2 == 0)
				continue;
			System.out.println(i);
		}
	}

}
