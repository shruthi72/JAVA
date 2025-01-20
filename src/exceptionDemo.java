
//one try can have multiple catch block
//catch should be written immediately after try
//one way finally not executed -> forcefully stopping JVM by hitting stop
public class exceptionDemo {
	
	int a=4;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b=7;
		int c=0;
		try
		{
			int x=b/c;
			System.out.println(x);
		}
		catch(ArithmeticException et)
		{
			System.out.println("Arithmetic Exception");
		}
		catch(IndexOutOfBoundsException ie)
		{
			System.out.println("Array index Exception");
		}
		catch(Exception e)// here Exception is generic and e is variable name
		{
			System.out.println("Catched Exception");
		}
		finally
		{
			//this block is executed irrespective of exception throws or not
			//in Automation we can write close the browser, delete cookies
			System.out.println("Driver close");
		}
		

	}

}
