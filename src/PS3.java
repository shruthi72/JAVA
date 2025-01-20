

public class PS3 extends PS4{
	int a; //current class variable and below int i is instance variable
	public PS3(int i) {
		// TODO Auto-generated constructor stub
		super(i);//parent class constructor will be invoked
		//integer i scope is for only inside this method so use globally use "this" keyword
		this.a=i;
	}


	public int increment()
	{
		a=a+1;
		return a;
	}
	

	public int decrement()
	{
		a=a-1;
		return a;
	}

}
