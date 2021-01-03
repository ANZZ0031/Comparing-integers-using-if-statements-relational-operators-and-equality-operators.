import java.util.Scanner;

public class Comparison {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Enter first interger");
		int number1 = sc.nextInt();
		
		System.out.print("Enter second interger");
		int number2 = sc.nextInt();
		
		if (number1 == number2) {
			System.out.printf("%d == %d%n", number1, number2);
		}
		
		if(number1 != number2) {
			System.out.printf("%d != %d%n", number1, number2);
		}
		
		if(number1 < number2) {
			System.out.printf("%d < %d%n", number1, number2);
		}
		
		if(number1 > number2) {
			System.out.printf("%d > %d%n", number1, number2);
		}
		if(number1 <= number2) {
			System.out.printf("%d <= %d%n", number1, number2);
		}
		
		if(number1 >= number2) {
			System.out.printf("%d >= %d%n", number1, number2);
		}
	}
	

}
