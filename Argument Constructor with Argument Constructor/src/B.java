
public class B extends A {
	int a;
	B(){
		System.out.println("It's B");
	}
	B(int a){
		super(10);
		System.out.println("It's Argument Constructor of B");
	}

	public static void main(String[] args) {
		B b = new B(10);
	}
}
