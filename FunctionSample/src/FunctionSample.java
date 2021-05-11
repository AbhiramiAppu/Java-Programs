import java.util.Scanner;

public class FunctionSample {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter two numbers : ");
		int num1 = s.nextInt();
		int num2 = s.nextInt();
		int result = sum(num1,num2);
		System.out.println("Sum of the entered numbers is : "+result);
	}


static int sum(int a,int b) {
	int c = a + b;
	return c;
}

}