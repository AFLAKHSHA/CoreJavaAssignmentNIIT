package friday.AssignmentWeek2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EmployeeMain {

	public static void main(String[] args) throws NumberFormatException, IOException {

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader bfr = new BufferedReader(isr);

		System.out.println("enter number of employees");
		int no = Integer.parseInt(bfr.readLine());

		
		EmployeeVO emps[] = new EmployeeVO [no];
		
		for (int i = 0; i < emps.length; i++) {
			emps[i] = new EmployeeVO ();
			System.out.println("enter emp id");
			emps[i].setEmpid(Integer.parseInt(bfr.readLine()));
			System.out.println("enter emp name");
			emps[i].setEmpname(bfr.readLine());
			System.out.println("enter annual income");
			emps[i].setAnnualIncome(Double.parseDouble(bfr.readLine()));
			new EmployeeBO().callincomeTax(emps[i]);	
		}
		
		System.out.println("--------------------");
		for (int i = 0; i < emps.length; i++) {
			System.out.println(emps[i].toString());
		}
		
	}

}
