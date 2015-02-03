
public class BasePlusCommissionEmployee2 extends CommissionEmployee2
{
	private double baseSalary;
	
	public BasePlusCommissionEmployee2 (String first, String last, String ssn,
			double sales, double rate, double salary)
	{
		super (first, last, ssn, sales, rate);
		setBaseSalary(salary);
	}
	
	public void setBaseSalary (double salary)
	{
		if (salary > 0.0)
			baseSalary = salary;
		else
			throw new IllegalArgumentException ("salary must be > 0.0");
	}
	
	public double getBaseSalary ()
	{
		return baseSalary;
	}
	
	@Override
	public double earnings ()
	{
		return baseSalary + super.earnings();
	}
	
	@Override
	public String toString ()
	{
		return String.format("%s %s; %s: $%,.2f",
				"base salaried", super.toString(),
				"base salary", getBaseSalary());
	}
}

