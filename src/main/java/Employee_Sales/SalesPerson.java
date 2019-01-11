package Employee_Sales;

public class SalesPerson extends Employe
{
private int clientMaintain;
private int clientNew;

public SalesPerson(String firstName, String lastName,double salary,int clientNew, int clientMaintain)
{
	super(firstName, lastName, salary);
	this.clientMaintain = clientNew;
	this.clientNew = clientMaintain;
}
@Override
public String toString()
{
	
	return "Name: " + "\n" + firstName + " " + lastName+ "\n" + "\nNumber of Maintained Clients: " + clientMaintain +"\nYou will earn an extra 500kr for each." +"\n" + "\nAnd New Clients: " + clientNew + "\nYou will earn an extra 1000kr for each." + "\n" + "\nYour salary would be: " + salary + "kr" ; 
}
public int getClientMaintain() {
	return clientMaintain;
}
public void setClientMaintain(int clientMaintain) {
	this.clientMaintain = clientMaintain;
}
public int getClientNew() {
	return clientNew;
}
public void setClientNew(int clientNew) {
	this.clientNew = clientNew;
}






}
