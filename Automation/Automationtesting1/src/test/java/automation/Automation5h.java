package automation;
  class abc{
	private int a=10,b=20; //private access modifier
	 protected void show() {   //protected access modifier
		System.out.println("a and b are private");
	}
	 void show1() {//default access modifier
		 System.out.println("This is default access modifier method");
	 }
	 
	public void show2() {//public access modifier
		System.out.println("This is Public access modifier method");
	}
	
}
public class Automation5h extends abc{
	
	
	public static void main(String[] args) {
		Automation5h auto=new Automation5h();
		auto.show();
		auto.show1();
		auto.show2();
		
	}

}
