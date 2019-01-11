package Employee_Sales;



public class Employe 
{

	protected String firstName;
	protected String lastName;
	protected static double salary;
	
	
	public Employe(String firstName, String lastName, double salary)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		Employe.salary = 25000;

	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		Employe.salary = salary;
	}
}
