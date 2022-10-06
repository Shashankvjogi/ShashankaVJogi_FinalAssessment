package automation;

class grandparent{
	String name="virat";
	void show1() {
		System.out.println("Grand parent");
		
	}
}
class parent extends grandparent{
	
	void show2() {
		System.out.println("Parent"); 

	}
}

public class Automation5c extends parent{
	void show3() {
		System.out.println("Child");
	}
	
	public static void main(String[] args) {
		Automation5c n=new Automation5c();
		n.show1();
		n.show2();
		n.show3();
	}

}