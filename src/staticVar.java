
public class staticVar {
	
	String name;  //Instance Variable
	String address;
	static String city="Chennai";//class variable
	static int i=0;
	/*static block can be used for line 6 and 7
	static
	{
		city="Chennai";
		i=0;
	}*/
	
	public staticVar(String name, String street)
	{
		this.name=name;
		this.address=street;
		i++;
		System.out.println(i);
	}
	public void display()
	{
		System.out.println(name+" "+city);
	}
	public static void method()
	{
		//static method use only static variable
		System.out.println(city);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		staticVar sv=new staticVar("Name","Street");
		staticVar sv1=new staticVar("Name1","Street1");
		sv.display();
		//static methods can be accessed using class name as below
		staticVar.method();
		//static variable run time value allocation
		staticVar.i=4;
		//non-static variable run time value allocation
		sv.address="Non-static";

	}

}
