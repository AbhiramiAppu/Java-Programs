import java.util.Scanner;

public class Swap {
public static void main(String[] args) {
	int n,i;
	int a1[] = new int[100];
	int a2[] = new int[100];
	int temp[] = new int[100];
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the size of arrays : ");
	n = sc.nextInt();
	
	System.out.println("Enter the values of Array1 : ");
	for(i=0;i<n;i++){
		a1[i] = sc.nextInt();
	}
	System.out.println("Enter the values of Array2 : ");
	for(i=0;i<n;i++){
		a2[i] = sc.nextInt();
	}
	for(i=0;i<n;i++){
		temp[i] = a1[i];
		a1[i] = a2[i];
		a2[i] = temp[i];
	}
	System.out.println("Arrays after swapping : ");
	System.out.println("\nArray1 :");
	for(i=0;i<n;i++){
		System.out.print(a1[i]+" ");
	}
	System.out.println("\nArray2 :");
		for(i=0;i<n;i++){
			System.out.print(a2[i]+" ");
		}
	
}
}
