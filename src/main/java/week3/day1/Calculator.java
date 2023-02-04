package week3.day1;

public class Calculator {
	public int add(int num1, int num2) {
		return num1+num2;
	}
	public int add(int num1, int num2, int num3) {
		return num1+num2+num3;
	}
	public void multiple(double num1, double num2) {
		System.out.println("The double multiplication Ans: "+ (num1*num2));
	}
	public void multiple(int num1, double num2) {
		System.out.println("The multiplication Ans: "+ (num1*num2));
	}
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		System.out.println("Addition of 2 Numbers: "+calc.add(10, 20));
		System.out.println("Addition of 3 Numbers: "+calc.add(10, 20, 30));
		calc.multiple(2.23, 2.23);
		calc.multiple(2, 10.5);
	}
}
