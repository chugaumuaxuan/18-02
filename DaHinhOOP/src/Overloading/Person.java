package Overloading;

public class Person {
	String name;
	int age;
	String nationality;
	
	Person(){}
	
	Person(String n, int a){
		name = n;
		age = a;
	}
	
	//overloading constructor
	Person(String n, int a, String nation){
		this(n, a);
		nationality = nation;
	}
	
	void tinhtong (int a){
		a = 10;
	}
	
	//overloading method
	void tinhtong( int a, int b) {
		b = 20;
		int tong = a + b;
		System.out.println(tong);
	}
	
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.tinhtong(0, 0);
	}
	
}
