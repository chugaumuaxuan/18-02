package TinhChatCuaOOP;

public class KeThua {
	public static void main(String[] args) {
		Creatures c = new Creatures();
		c.Creatures = "Animals";
		c.breathing();
		
		UnderWaterCreatures u = new UnderWaterCreatures();
		u.UnderWaterCreaturesName ="Fish";
		u.breathing();
	}
}

class Creatures{
	protected String Creatures;
	protected void breathing() {
		System.out.println(Creatures + " is breathing");
	}
}

class UnderWaterCreatures extends Creatures{
	 protected String UnderWaterCreaturesName;

	@Override
	 protected void breathing() {
		 System.out.println( Creatures +" "+ UnderWaterCreaturesName + " is breathing");
	 }
	 
	 protected void swimming() {
		 System.out.println( Creatures +" "+ UnderWaterCreaturesName + " is swimming");
	 }
	 
}

class Whale extends UnderWaterCreatures {
	protected String color;
	
	 @Override
	 protected void breathing() {
		 System.out.println( Creatures +" "+ UnderWaterCreaturesName + " "+ color + " is breathing");
	 }
	 
	 @Override
	 protected void swimming() {
		 System.out.println(  Creatures +" "+ UnderWaterCreaturesName + " "+ color + " is swimming");
	 } 
}

class Turtle extends UnderWaterCreatures {
	protected int age;
	
	 @Override
	 protected void breathing() {
		 System.out.println( Creatures +" "+ UnderWaterCreaturesName + " "+ age + " is breathing");
	 }
	 
	 @Override
	 protected void swimming() {
		 System.out.println(  Creatures +" "+ UnderWaterCreaturesName + " "+ age + " is swimming");
	 } 
}
