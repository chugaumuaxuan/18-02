package TinhChatCuaOOP;

public class DongGoi {
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}

class main{
	public static void main(String[] args) {
		
		DongGoi d = new DongGoi();
		d.setName("Nguyen");
		d.setAge(12);
		
		System.out.println(d.getName() + " " + d.getAge() + " tuoi");
	}
}
