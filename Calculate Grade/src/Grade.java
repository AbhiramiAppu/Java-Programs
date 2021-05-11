import java.util.Scanner;

public class Grade {
public static void main(String[] args) {
	float totalmark;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the percentage : "); 
	totalmark = sc.nextFloat();

	if(totalmark<100 && totalmark>90){
		System.out.println("You have got A grade");
	}else if(totalmark<90 && totalmark>80){
		System.out.println("You have got B  grade");
	}else if(totalmark<80 && totalmark>70){
		System.out.println("You have got C grade");
	}else if(totalmark<70 && totalmark>60){
		System.out.println("You have got D grade");
	}else if(totalmark<60 && totalmark>50){
		System.out.println("You have got E grade");
	}else if(totalmark<50){
		System.out.println("You are failed!!");
	}else{
		System.out.println("You are wrongly entered");
	}
}
}
