import java.util.Scanner;

public class NumberPattern {
public static void main(String[] args) {
	int i,j,limit;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the limit : ");
	limit = sc.nextInt();
	
	for(i=1;i<=limit;i++) {
		for(j=1;j<=i;j++) {
			System.out.print(j+" ");
		}
		System.out.println();
	}
}
}
