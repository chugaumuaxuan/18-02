package Overriding;

public class main {
	public static void main(String[] args) {
		
		Cat cat = new Cat();
		cat.setName("Allie");
		cat.setLegs(4);
		cat.setAge(2);
		
		cat.cacthMouse();
		cat.rawr();
		cat.display();
	}
}
