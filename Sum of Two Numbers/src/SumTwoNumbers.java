import java.util.Scanner;

public class SumTwoNumbers {
	public static void main(String args[]) {
		System.out.println("Enter two numbers : ");
		try (Scanner s = new Scanner(System.in)) {
			int a = s.nextInt();
			int b = s.nextInt();
			int c = a + b;
			System.out.println("Sum of two numbers is : "+c);
		}
	}
	
	
	
}
