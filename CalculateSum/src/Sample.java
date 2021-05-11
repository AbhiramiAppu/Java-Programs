import java.util.Scanner;

public class Sample {
public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter two numbers : ");
	int num1 = sc.nextInt();
	int num2 = sc.nextInt();
	
	
	Sum s1 = new Sum();
	Sum s2 = new Sum();
	
	
	s1.calculateSum(num1,num2);
	s1.display();
	
	
	System.out.println("Enter two numbers : ");
	int num3 = sc.nextInt();
	int num4 = sc.nextInt();
	
	s2.calculateSum(num3,num4);
	s2.display();
	
}
}
