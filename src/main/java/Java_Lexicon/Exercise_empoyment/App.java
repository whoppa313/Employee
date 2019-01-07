package Java_Lexicon.Exercise_empoyment;

import Employee_Developer.SystemDeveloper;

public class App 
{
    public static void main( String[] args )
    {
        SystemDeveloper victor = new SystemDeveloper("Victor", "Holmquist", 0, 1, 2);
    
     
                                      
        
        if (victor.getNumbOfLang() == 1)
        {
        	victor.setSalary(26000);
        	if(victor.getNumbOfCertificates() > 0)
        	{
        		victor.setSalary(26000 + 500 * victor.getNumbOfCertificates());
        	}
        }
        
        
        
        
        System.out.println(victor);
    }
    
    
    
   
    
    
 
}

