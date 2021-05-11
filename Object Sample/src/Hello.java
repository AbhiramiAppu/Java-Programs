
public class Hello {
	int a=10;
	static int b=20;
public static void main(String args[]) {
	Hello h = new Hello();
	Hello h1 = new Hello();
	
	h.b = 200;
	h1.b = 500;
	System.out.println(h.b);
	System.out.println(h1.b);
	
	h.a = 2500;
	h1.a = 2000;
	System.out.println(h.a);
	System.out.println(h1.a);
	h.hey();
	}


void hey() {
	Hello h = new Hello();
	h.a = 50;
	System.out.println(h.a);
	System.out.println(h.b);
}
}