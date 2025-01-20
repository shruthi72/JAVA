
public class seleniumChrome implements WebDriver {

	public static void main(String[] args)
	{
	WebDriver driver=new seleniumChrome();
	driver.ChromeDriver();
	driver.edgeDriver();
	driver.firefoxDriver();
	
	seleniumChrome s=new seleniumChrome();
	s.demo();
	}
	@Override
	public void ChromeDriver() {
		// TODO Auto-generated method stub
		System.out.println("Chrome Browser");		
	}

	@Override
	public void firefoxDriver() {
		// TODO Auto-generated method stub
		System.out.println("Firefox Browser");
		
	}

	@Override
	public void edgeDriver() {
		// TODO Auto-generated method stub
		System.out.println("Edge Browser");
		
	}
	public void demo()
	{
		System.out.println("Independent method");
	}
		

}

