import java.util.Scanner;

public class Array {
public static void main(String[] args) {
	int a[] = new int[20];
	int n;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the limit : ");
	n = sc.nextInt();
	Array ar = new Array();
	ar.getArray(a,n);
	ar.displayArray(a, n);
}

void getArray(int a[], int n) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the array elements : ");
	for(int i=0;i<n;i++) {
		a[i] = sc.nextInt();
	}
}

void displayArray(int a[], int n) {
	Scanner sc = new Scanner(System.in);
	System.out.println("The array elements are : ");
	for(int i=0;i<n;i++) {
		System.out.println(a[i]);
	}
}

}
