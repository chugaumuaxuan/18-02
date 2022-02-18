package This;

public class ThisInvokeCurrentMethod {
	String a;
	int b;
	float c;

	ThisInvokeCurrentMethod(){}
	
	void display2() {
		System.out.println("hello world");
	}
	
	void m() {
		this.display2();
	}
	
	ThisInvokeCurrentMethod(String a, int b){
		this.a = a;
		this.b = b;
	}
	
	ThisInvokeCurrentMethod(String a, int b, float c){
		this(a, b);
		this.c = c;
	}
	
	public static void main(String[] args) {
		ThisInvokeCurrentMethod p = new ThisInvokeCurrentMethod();
		p.m();	
	}
}

