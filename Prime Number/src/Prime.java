import java.util.Scanner;

public class Prime {
	public static void main(String args[]) {
	int flag = 0;	
	System.out.println("Enter a number : ");
	
	Scanner sc = new Scanner(System.in);

	int num = sc.nextInt();
	
	
	for(int i=2;i<num;i++) {
		if(num%i == 0) {
			flag = 1;
			break;
		}
	}

if(flag == 1) {
	System.out.println("Entered number is not Prime");
}else {
	System.out.println("Entered number is Prime");
}
}
}