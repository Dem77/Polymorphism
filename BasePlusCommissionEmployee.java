
public class BasePlusCommissionEmployee extends CommissionEmployee
{
	private double baseSalary;

	public BasePlusCommissionEmployee(String first, String last, String ssn,
			double sales, double rate, double salary) 
	{
		super(first, last, ssn, sales, rate);
		setBaseSalary(salary);
	}
	
	public void setBaseSalary (double salary)
	{
		if (salary >= 0.0)
			baseSalary = salary;
		else
			throw new IllegalArgumentException ("base salary must be >= 0.0");
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
	
	public String toString ()
	{
		return String.format("%s: %s %s\n%s: %s\n%s: %.1f\n%s: %.2f\n%s: %.2f",
		"commission employee", getFirstName(), getLastName(),
		"social security number", getSocialSecurityNumber(),
		"gross sales", getGrossSales(),
		"comission rate",getCommissionRate(),
		"base salary", getBaseSalary());
	}
}
