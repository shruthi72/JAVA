import java.util.ArrayList;

public class arrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Implements List Interface ->ArrayList, Linkedlist, Vector - accept duplicate value
		//array has fixed size, arraylist has dynamic size
		ArrayList<String> a=new ArrayList<String>();
		a.add("Name");
		a.add("Address");
		a.add("Address");
		System.out.println(a);
		//a.remove(1);
		System.out.println(a.get(1));
		System.out.println(a.contains("name"));
		
		System.out.println(a.indexOf("Name"));
		System.out.println(a.isEmpty());
		System.out.println(a.size());

	}

}
