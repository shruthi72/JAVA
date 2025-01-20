
public class ChildEmirates extends ParentAircraft {

	public static void main(String[] args)
	{
		ChildEmirates c=new ChildEmirates();
		
		c.bodyColor();
		c.engine();
		c.safety();
	
	}
	
	public void bodyColor() {
		// TODO Auto-generated method stub
		String name="Child";
		System.out.println(name); //this will print local variable value
		System.out.println(super.name);//this will print parent variable value since we are using variable name same
		
	}
	

}
