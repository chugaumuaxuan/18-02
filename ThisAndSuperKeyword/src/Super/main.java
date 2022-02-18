package Super;

public class main {
	public static void main(String[] args) {
		Father f = new Father("Nguyen", 41);
		
		Son s = new Son("Pham", 15, "Le Hong Phong");
		
		f.display();
		s.display();
		
	}
}
