
public class HelloWorld {
	public static void a() {
		System.out.print(1);
	}
	
	public static void b() {
		System.out.print(2);
		a();
		System.out.print(3);
		c();
		System.out.print(4);
	}
	
	public static void c() {
		System.out.print(5);
	}

	public static void main(String args[]) {
	
	System.out.print(6);
	b();
	System.out.println("Hello World");
	System.out.print(7);
	}
}
