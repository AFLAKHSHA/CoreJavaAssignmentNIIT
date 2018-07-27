package friday.AssignmentWeek2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CalculateDemo {
	public static void main(String[] args) throws NumberFormatException, IOException {

		InputStreamReader ins = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(ins);

		int x, y;

		System.out.println("enter 2 numbers");

		x = Integer.parseInt(br.readLine());
		y = Integer.parseInt(br.readLine());

		Addition a1 = new Addition(x, y);
		Subtraction s1 = new Subtraction(x, y);
		Multiplication m1 = new Multiplication(x, y);
		Division d1 = new Division(x, y);

		Arithmetic[] ar = { a1, s1, m1, d1 };

		int choice;
		System.out.println("1= addition \n 2= subtraction \n 3 = multiplication\n 4 = Division \n enter your choices");

		choice = Integer.parseInt(br.readLine());

		// get users input about choice (1 for add, 2 for sub, 3 for multi, 4 for div)
		// choice

		System.out.println(ar[choice - 1].calculate());
	}

}
