package This;

public class ThisPassInConstructor {
	Abc obj;
	
	ThisPassInConstructor(Abc obj){
		this.obj = obj;
	}
	
	void display() {
		System.out.println(obj.data);
	}	
}

class Abc{
	int data = 10;
	
	Abc(){
		ThisPassInConstructor b = new ThisPassInConstructor(this);
		b.display();
	}
}

class mainnnnn{
	public static void main(String[] args) {
		Abc a = new Abc();
	}
}