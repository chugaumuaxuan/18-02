package Overriding;

public class Cat extends Animals {
	private int age;
	
	Cat(){}
	
	Cat(String n, int l, int a){
		super(n , l);
		age = a;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	//override method
	protected void display() {
		System.out.println(getName() + " " + getLegs() +" chan " + getAge() + " tuoi " );
	}
	
	protected void rawr() {
		System.out.println(getName() + " keu meo meo");
	}
	
	//method rieng
	void cacthMouse() {
		System.out.println(getName() + " is catching mouse");
	}
	
	
}
