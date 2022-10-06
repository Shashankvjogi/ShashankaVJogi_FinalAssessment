package automation;



abstract class abs{
	abstract void m1();
}
public class Automation5d extends abs{
	void m1() {
		 System.out.println("This is abstract class");
	}
	public static void main(String[] args) {
		Automation5d a=new Automation5d();
		a.m1();

	}

}
