package Employee_Developer;

public class Employee
{

	protected String firstName;
	protected String lastName;
	protected static double salary;
	
	
	public Employee(String firstName, String lastName, double salary)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		Employee.salary = 25000;

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
		Employee.salary = salary;
	}
	
	
	
	
	
	
	
	
}
