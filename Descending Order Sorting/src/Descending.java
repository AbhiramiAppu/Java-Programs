import java.util.Scanner;

public class Descending {
	public static void main(String[] args) {
		int n,i,j,temp;
		int a[] = new int[20];
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter the size of array : ");
		n = sc.nextInt();
		System.out.println("Enter the array elements : ");
		for(i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		
		for(i=0;i<n-1;i++) {
			for(j=i+1;j<n;j++) {
				if(a[i]  < a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
				
			}
		}
		
		System.out.println("Array elements in Descending order are : ");
		for(i=0;i<n;i++) {
			System.out.print("\t"+a[i]);
		}
	}
	
	
	
}
