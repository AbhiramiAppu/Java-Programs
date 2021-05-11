import java.util.Scanner;
import java.lang.Math;
public class Armstrong {
	
	public static void main(String[] args) {
		int num,sum=0,rem,count=0,original,temp;
		
		System.out.println("Enter a number : ");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		temp = original = num;
		
		while(num != 0) {
			count++;
			num = num / 10;
		}
		
		while(temp != 0) {
			rem = temp % 10;
			sum = sum + (int) Math.pow(rem,count);
			temp = temp / 10;
		}
		
		if (sum == original) {
			System.out.println("Entered number " +original+ " is an Armstrong Number" );
		}else {
			System.out.println("Entered number " +original+ " is not an Armstrong Number" );
		}
	}

	
}
