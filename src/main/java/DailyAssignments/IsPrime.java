package DailyAssignments;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Given input number
		int inputNumber = 7;
		boolean flag = true;
		for(int i=2; i < inputNumber-1 ; i++) {
			//if any division reminder is zero then set flag to false
			if (inputNumber % i == 0)
				flag = false;
		}
		//Check the flag value and Prin the String
		if (flag)
			System.out.println("Prime");
		else
			System.out.println("Non-Prime");
	}
}
