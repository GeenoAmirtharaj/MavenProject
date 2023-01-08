package week1.day1;

public class Fibbinocci {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int firstNum = 0;
		int secondNum = 1;
		int sum;
		System.out.print(firstNum+ " ");
		System.out.print(secondNum+ " ");
		for(int i=1; i <= 11; i++) {
			sum = firstNum + secondNum;
			firstNum = secondNum;
			secondNum = sum;
			System.out.print(sum+ " ");
			
		}
	}

}
