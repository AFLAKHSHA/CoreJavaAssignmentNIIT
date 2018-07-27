package friday.AssignmentWeek2;

public class EmployeeBO {

	public void callincomeTax(EmployeeVO evo) {
		double incomeTax = evo.getAnnualIncome() * (30.0 / 100);
		evo.setIncometax(incomeTax);

	}
}
