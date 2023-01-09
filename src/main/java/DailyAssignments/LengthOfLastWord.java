package DailyAssignments;

public class LengthOfLastWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "I am from TAMILNADU";
		String[] split = text.split(" ");
		System.out.println("Length of the last word is: " + split[split.length - 1].length());
	}

}
