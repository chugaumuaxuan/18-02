package This;

public class ThisPassInMethod {
	void m(ThisPassInMethod tpi) {
		System.out.println("keyword 'this' pass as an argument in the method");
	}
	
	void display() {
		m(this);
	}
	
	public static void main(String[] args) {
		ThisPassInMethod abc = new ThisPassInMethod();
		abc.display();
	}
}
