package friday.AssignmentWeek2;

public class EmployeeVO {

	int empid;
	String empname;
	double annualIncome;
	double Incometax;

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public double getAnnualIncome() {
		return annualIncome;
	}

	public void setAnnualIncome(double annualIncome) {
		this.annualIncome = annualIncome;
	}

	public double getIncometax() {
		return Incometax;
	}

	public void setIncometax(double incometax) {
		Incometax = incometax;
	}

	public EmployeeVO(int empid, String empname, double annualIncome, double incometax) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.annualIncome = annualIncome;
		Incometax = incometax;
	}

	public EmployeeVO() {
		//default
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(Incometax);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(annualIncome);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + empid;
		result = prime * result + ((empname == null) ? 0 : empname.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployeeVO other = (EmployeeVO) obj;
		if (Double.doubleToLongBits(Incometax) != Double.doubleToLongBits(other.Incometax))
			return false;
		if (Double.doubleToLongBits(annualIncome) != Double.doubleToLongBits(other.annualIncome))
			return false;
		if (empid != other.empid)
			return false;
		if (empname == null) {
			if (other.empname != null)
				return false;
		} else if (!empname.equals(other.empname))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "EmployeeVO [empid=" + empid + ", empname=" + empname + ", annualIncome=" + annualIncome + ", Incometax="
				+ Incometax + "]";
	}

}
