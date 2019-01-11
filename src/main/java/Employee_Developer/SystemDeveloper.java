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
		
		return "Name: " + "\n" + firstName + " " + lastName+ "\n" + "\nNumber of know Languages: " + numbOfLang +"\nYou will earn an extra 1500kr for each." +"\n" + "\nAnd Certificates: " + numbOfCertificates + "\nYou will earn an extra 1000kr for each." + "\n" + "\nYour salary would be: " + salary +"kr" ; 
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

