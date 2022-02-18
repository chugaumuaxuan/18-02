package This;

public class ThisInvokeCurrentConstructor {	
	
	ThisInvokeCurrentConstructor(){
		System.out.println("hello world");
	}
	
	ThisInvokeCurrentConstructor(int x){
		this();
		System.out.println(x);
	}
	
	public static void main(String[] args) {
		ThisInvokeCurrentConstructor t = new ThisInvokeCurrentConstructor(5);
	}
}
