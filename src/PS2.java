import org.testng.annotations.Test;

public class PS2 extends PS1{

	@Test
	public void child()
	{
		PS3 ps3=new PS3(3); //creating object of PS3 class and passing parameterized Constructor
		int a =3;
		display(); //calling method of parent class as we used extends
		System.out.println(ps3.increment());
		System.out.println(ps3.decrement());
		
		//PS4 ps4=new PS4(3); -> again creating one more object for another class avoided by using inheritance
		System.out.println(ps3.multi());
		
	}

}
