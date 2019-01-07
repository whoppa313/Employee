package Employee_Developer;

public class SystemDeveloper extends Employee
{
	
	private int numbOfLang;
	private int numbOfCertificates;	

	public SystemDeveloper(String firstName, String lastName,double salary,int numbOfLang, int numbOfCertificates) {
		super(firstName, lastName,salary);
		this.numbOfLang = numbOfLang;
		this.numbOfCertificates = numbOfCertificates;
	}
	@Override
	public String toString()
	{
		
		return "Namn " + firstName + " " + lastName + "\nNumber of know Languages: " + numbOfLang + "\nAnd Certificates: " + " " + numbOfCertificates + "\nYour salary would be: " + salary ; 
	}
	public int getNumbOfLang() {
		return numbOfLang;
	}

	public void setNumbOfLang(int numbOfLang) {
		this.numbOfLang = numbOfLang;
	}

	public int getNumbOfCertificates() {
		return numbOfCertificates;
	}

	public void setNumbOfCertificates(int numbOfCertificates) {
		this.numbOfCertificates = numbOfCertificates;
	}
	
	
	
}

