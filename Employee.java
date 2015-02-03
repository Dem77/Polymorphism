
public abstract class Employee 
{
	private String firstName;
	private String lastName;
	private String socialSecurityNumber;
	
	public Employee (String first, String last, String ssn)
	{
		firstName = first;
		lastName = last;
		socialSecurityNumber = ssn;
	}
	
	public void setFirstName (String name)
	{
		firstName = name;
	}
	
	public String getFirstName ()
	{
		return firstName;
	}
	
	public void setLastName (String name)
	{
		lastName = name;
	}
	
	public String getLastName ()
	{
		return lastName;
	}
	
	public void setSocialSecurityNumber (String ssn)
	{
		socialSecurityNumber = ssn;
	}
	
	public String getSocialSecurityNumber ()
	{
		return socialSecurityNumber;
	}
	
	@Override
	public String toString ()
	{
		return String.format("%s %s\nsocial security number: %s",
				getFirstName(), getLastName(), getSocialSecurityNumber());
	}
	
	public abstract double earnings ();
}
