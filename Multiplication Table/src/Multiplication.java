import java.util.Scanner;

public class Multiplication {
public static void main(String[] args) {
	int num,i,mul;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number : ");
	num = sc.nextInt();
	
	System.out.println("The Multiplication table of "+num+" is : ");
	for(i=1;i<=10;i++) {
		mul = i * num;
		System.out.println(i+" * "+num+" = "+mul);
	}
}
}
