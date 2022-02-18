package Overriding;

public class Animals {
	private String name;
	private int legs;
	
	protected Animals() {}
	
	protected Animals(String n, int l){
		name = n;
		legs = l;
	}

	protected String getName() {
		return name;
	}

	protected void setName(String name) {
		this.name = name;
	}

	protected int getLegs() {
		return legs;
	}

	protected void setLegs(int legs) {
		this.legs = legs;
	}
	
	protected void display() {
		System.out.println(getName() + getLegs());
	}
	
	protected void rawr() {
		System.out.println(getName() + " keu grr");
	}
	
}
