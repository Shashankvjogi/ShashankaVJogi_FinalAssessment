package automation;
class test{
	 void show() {
		 
		 System.out.println("This is super class");
	 }
}
public class Automation5a extends test  {
 void show() {
		 System.out.println("This is Sub class");
	 }

	public static void main(String[] args) {
		Automation5a auto=new Automation5a();
		auto.show();
	}
}
