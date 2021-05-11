import java.util.Scanner;

public class Recursion {
public static void main(String[] args) {
	int fact,num,f;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number : ");
	num = sc.nextInt();
	Recursion r = new Recursion();
	f = r.fact(num);
	System.out.println("The factorial of "+num+" is : "+f);
}

private int fact(int num) {
	// TODO Auto-generated method stub
	if(num<=1)
		return 1;
	return num * fact(num - 1);
	
}
}
