package Super;

public class Son extends Father {
	private String School;
	private String city ="Ha Nam";

	
	protected Son(){}
	
	protected Son(String n, int a, String s) {
		super(n, a);
		School = s;
	}
	private String getSchool() {
		return School;
	}

	protected void setSchool(String school) {
		School = school;
	}

	protected void display() {
		System.out.println(getName()+ " " + getAge() + " " + city);
		eating();
		sleeping();
		meetingFamily();
		super.display2();
	}
	
	
	
}

