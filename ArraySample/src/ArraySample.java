import java.util.Scanner;

public class ArraySample {
public static void main(String[] args) {
	int n;
	int a[] = new int[10];
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number of elements : ");
	n = sc.nextInt();
	
	System.out.println("Enter the elements of array : ");
	for(int i=0;i<n;i++) {
		a[i] = sc.nextInt();
	}

	System.out.println("Array elements are : ");
	for(int i=0;i<n;i++) {
		System.out.println(a[i]);
	}

}

}
