
public class thisDemo {
	int a=1; //global variable
	public void getData()
	{
		int a=2;//local variable
		System.out.println(a);
		System.out.println(this.a);
		
		//sum both a value
		int b=a+this.a;
		System.out.println(b);
		
		//this - refers to current object and object scope lies in class level
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		thisDemo td=new thisDemo();
		td.getData();

	}

}
