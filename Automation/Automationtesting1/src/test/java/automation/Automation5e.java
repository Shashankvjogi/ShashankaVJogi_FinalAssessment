package automation;


interface inter{
	void m1();
}

public class Automation5e implements inter{

public void m1() {
		
	System.out.print("This is Interface");	
	}
	public static void main(String[] args) {
		Automation5e i=new Automation5e();
		i.m1();
	}
}
