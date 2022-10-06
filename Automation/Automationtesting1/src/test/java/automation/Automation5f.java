package automation;

public class Automation5f {

	public static void main(String[] args) {
				int a = 10,res;
				try {
					res = a / 0;
					System.out.println("result" + res);
				}

				catch (ArithmeticException e) {
					System.out.println("Exception caught:Division by zero");
				}

				finally {
					System.out.println("I am in final block");
				}
			}
	}


