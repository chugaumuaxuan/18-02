package This;

public class ThisReturnClassInstance {
	String a;
		
	ThisReturnClassInstance getThisReturnClassInstance(){
		return this;
	}
	
	void display() {
		System.out.println("Hello world");
	}	
}

class test{
	public static void main(String[] args) {
		new ThisReturnClassInstance().getThisReturnClassInstance().display();
	}
}