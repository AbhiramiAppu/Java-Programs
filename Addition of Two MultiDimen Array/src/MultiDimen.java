import java.util.Scanner;

public class MultiDimen {
public static void main(String[] args) {
	int array1[][] = new int[10][10];
	int array2[][] = new int[10][10];
	int n,i,j;
	int sum[][] = new int[10][10];
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the size of arrays : "); 
	n = sc.nextInt();
	System.out.println("Enter the values of array1 : ");
	for(i=0;i<n;i++){
		for(j=0;j<n;j++){
			array1[i][j] = sc.nextInt();
		}
	}

	System.out.println("Enter the values of array2 : ");
	for(i=0;i<n;i++){
		for(j=0;j<n;j++){
			array2[i][j] = sc.nextInt();
		}
	}

	for(i=0;i<n;i++){
		for(j=0;j<n;j++){
			sum[i][j] = array1[i][j] + array2[i][j];
		}
	}

	System.out.println("Sum of two arrays is : ");
	for(i=0;i<n;i++){
		for(j=0;j<n;j++){
			System.out.print(sum[i][j]+"  ");
		}
		System.out.println();;
	}
}
}
