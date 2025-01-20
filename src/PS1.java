import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PS1 {
		//Inheritance Concept -> this is parent class
	
		@Test
		public void display()
		{
			System.out.println("This PS1 - Parent Class");
			
		}
		
		@BeforeMethod
		public void prereq()
		{
			System.out.println("Giving all the pre-requeste functions like open chromebrowser");
		}
		
		@AfterMethod()
		public void postreq()
		{
			System.out.println("Giving post-requeste like quit/close browser");
		}
		
}
