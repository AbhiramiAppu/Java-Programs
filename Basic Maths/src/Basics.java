import java.util.Scanner;

public class Basics {
public static void main(String args[]) {
	int num1,num2,choice;
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter two numbers : ");
	num1 = sc.nextInt();
	num2 = sc.nextInt();
	
	System.out.println("Please enter any of the following choices :- \n1 for Addition \n2 for Subtraction \n3 for Multiplication \n4 for Division");
	System.out.println("Enter the choice : ");
	choice = sc.nextInt();
	
	Operatioons op = new Operatioons();
	
	switch(choice) {
	case 1:
		op.addition(num1,num2);
		break;
	case 2:
		op.substraction(num1, num2);
		break;
	case 3:
		op.multiplication(num1, num2);
		break;
	case 4:
		op.division(num1, num2);
		break;
	default :
		System.out.println("Wrong Choice");	
	}
	
	
	
	
	
	
}
}
