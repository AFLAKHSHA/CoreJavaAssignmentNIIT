package friday.AssignmentWeek2;

import java.util.*;

public class EmployeeSort implements Comparator<EmployeeVO> {

	@Override
	public int compare(EmployeeVO o1, EmployeeVO o2) {
		return Double.compare(o2.getAnnualIncome(), o1.getAnnualIncome());
	}

}
