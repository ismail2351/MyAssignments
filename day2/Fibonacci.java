package week2.day2;

public class Fibonacci {

	public static void main(String[] args) {
		int firstNumber=0;
		int secondNumber=1;
		for (int i =1; i<=9; i++) {
			int sum = firstNumber+secondNumber;
			System.out.println(sum);
			firstNumber=secondNumber;
			secondNumber=sum;
	}
	}
}
