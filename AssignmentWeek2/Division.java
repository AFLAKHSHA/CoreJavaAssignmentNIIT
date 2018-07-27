package friday.AssignmentWeek2;

import javax.net.ssl.ExtendedSSLSession;

public class Division extends Arithmetic {

	
	public Division(int num1, int num2) {
		super(num1, num2);
		// TODO Auto-generated constructor stub
	}

	public int calculate() {
		try {
			return num1 / num2;
		}

		catch (ArithmeticException E) {
			System.out.println("division by zero is not possible");
		}
		return num1;

	}
}
