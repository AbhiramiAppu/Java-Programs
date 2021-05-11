import java.util.Scanner;

public class SumOdd {
	public static void main(String[] args) {
		int limit,i,sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the limit : ");
		limit = sc.nextInt();
		
		for(i=0;i<=limit;i++) {
			if(i%2 != 0) {
				sum = sum +i; 
			}
		}
		
		System.out.println("The sum of odd number upto "+limit+" is : "+sum);
	}

}
