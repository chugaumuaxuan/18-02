package This;

public class ThisReferInstance {
	String name;
	int age;
	
	ThisReferInstance(String n, int age){
		name = n;		//neu khong trung ten thi khong can this 
		this.age = age;
	}
	
	public static void main(String[] args) {
		ThisReferInstance p1 = new ThisReferInstance("Nguyen", 12);
	}
}

