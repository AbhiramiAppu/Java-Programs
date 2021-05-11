package character;

import java.util.Scanner;

public class Character {
public static void main(String[] args) {
	char c;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a characer : ");
	c = sc.next().charAt(0);
	System.out.println("C = "+c);
}
}
