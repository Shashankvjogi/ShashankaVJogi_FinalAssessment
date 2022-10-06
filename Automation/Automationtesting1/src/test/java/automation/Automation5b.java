package automation;
public class Automation5b {

	public static void main(String[] args) {
		
				Automation5b f=new Automation5b();
				f.show(2);
				f.show(1.0f);
				f.show(1, 2);
			}
			void show(int a) {
				System.out.println("Value of int a and b is :"+a);
				
			}
			void show(float b) {
				System.out.println("Value of  float a is :"+b);
				
			}
			void show(int a,int b) {
				System.out.println("Value of a and b is :"+a +" "+b);	
			}

}