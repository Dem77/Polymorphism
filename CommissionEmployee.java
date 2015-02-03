
public class CommissionEmployee 
{
	private String firstName;
	private String lastName;
	private String socialSecurityNumber;
	private double grossSales;
	private double commissionRate;
	
	public CommissionEmployee (String first, String last, String ssn, double sales, double rate)
	{
		firstName = first;
		lastName = last;
		socialSecurityNumber = ssn;
		setGrossSales(sales);
		setComissionRate(rate);
	}
	
	public void setFirstName (String first)
	{
		firstName = first;
	}
	
	public void setLastNme (String last)
	{
		lastName = last;
	}
	
	public String getLastName ()
	{
		return lastName;
	}
	
	public String getFirstName ()
	{
		return firstName;
	}
	
	public void setSocialSecurityNumber (String ssn)
	{
		socialSecurityNumber = ssn;
	}
	
	public String getSocialSecurityNumber ()
	{
		return socialSecurityNumber;
	}
	
	public void setGrossSales (double sales)
	{
		if (sales >= 0.0)
			grossSales = sales;
		else
			throw new IllegalArgumentException ("Gross sales must be >= 0.0");
	}
	
	public double getGrossSales ()
	{
		return grossSales;
	}
	
	public void setComissionRate (double rate)
	{
		if (rate > 0.0 && rate < 1.0)
			commissionRate = rate;
		else
			throw new IllegalArgumentException ("Comission rate must be > 0.0 and < 1.0");
	}
	
	public double getCommissionRate ()
	{
		return commissionRate;
	}
	
	public double earnings ()
	{
		return getCommissionRate() * getGrossSales();
	}
	
	public String toString ()
	{
		return String.format("%s: %s %s\n%s: %s\n%s: %.1f\n%s: %.2f",
				"commission employee", getFirstName(), getLastName(),
				"social security number", getSocialSecurityNumber(),
				"gross sales", getGrossSales(),
				"comission rate",getCommissionRate());
	}
}
