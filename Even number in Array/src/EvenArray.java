import java.util.Scanner;

public class EvenArray {
public static void main(String[] args) {
	int i,n,count=0;
	int a[] = new int[20];
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the size of array : ");
	n = sc.nextInt();
	System.out.println("Enter the array elements : ");
	for(i=0;i<n;i++) {
		a[i] = sc.nextInt();
	}
	
	System.out.println("The even numbers in array are : ");
	for(i=0;i<n;i++) {
		if(a[i] % 2 == 0) {
			System.out.print("\t"+a[i]);
			count++;
		}
	}
	System.out.println("\nThe number of even numbers in array are : "+count);
}
}
