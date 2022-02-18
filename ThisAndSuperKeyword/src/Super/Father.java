package Super;


public class Father implements ActivitesOfHuman, ActivitesOfHuman.ActivitiesOfFamily {
	private String name;
	private int age;
	protected String city ="HaNoi";
	
	protected Father(){}
	
	protected Father(String n, int a){
		name = n;
		age = a;
	}
	
	protected String getName() {
		return name;
	}

	protected void setName(String name) {
		this.name = name;
	}

	protected int getAge() {
		return age;
	}

	protected void setAge(int age) {
		this.age = age;
	}

	public void eating() {
		System.out.println(name + " is eating" );
	}
	
	public void sleeping() {
		System.out.println(name + " is sleeping");
	}
	
	public void meetingFamily() {
		System.out.println("Family is meeting");
	}
	
	protected void display() {
		System.out.println(getName()+ " " + getAge() + " " + city);
		eating();
		sleeping();
		meetingFamily();
		display2();
	}
	
	protected void display2() {
		System.out.println( getName() + " Hello World");
	}
	
}


