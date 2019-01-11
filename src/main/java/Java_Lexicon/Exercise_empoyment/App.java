package Java_Lexicon.Exercise_empoyment;

import Employee_Developer.SystemDeveloper;
import Employee_Sales.SalesPerson;

public class App 
{
    public static void main( String[] args )
    {
    	// the first double should stay ZERO since it will not change even if you alter it to anything else then ZERO.
    	// the second Double will set the number of languages the Developer knows.
    	// the third Double will set the number off Certificates the Developer has.
    	
    	boolean show = true;
    	
        SystemDeveloper sysDev = new SystemDeveloper("krister", "Lindblom", 0, 3, 2);
        
        SalesPerson salesMan = new SalesPerson("Sten", "Ljung", 0, 4, 2);
     
       
        
        if (show = true)
        {
        	sysDev.setSalary(25000 + 1500 * sysDev.getNumbOfLang() + 1000 * sysDev.getNumbOfCertificates());
        	salesMan.setSalary(25000 + 1000 * salesMan.getClientNew() + 500 * salesMan.getClientMaintain());
        }
        
        
         System.out.println(sysDev);
         System.out.println("\n");
         System.out.println(salesMan);
         
    }
    
    
    
   
    
    
 
}

