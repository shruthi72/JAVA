import java.util.HashSet;
import java.util.Iterator;

public class hashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Implement Set Interface - Hashset, Treeset, Linked Hashset
		//does not allow duplicate elements
		//there is no guarantee in sequential order
		
		HashSet<String> hs=new HashSet<String>();
		hs.add("USA");
		hs.add("UK");
		hs.add("INDIA");
		hs.add("INDIA");
		System.out.println(hs);
		System.out.println(hs.remove("UK"));
		System.out.println(hs.isEmpty());
		System.out.println(hs.size());
		
		Iterator<String> i=hs.iterator();
		
		while(i.hasNext())
		{
		System.out.println(i.next());
		}

	}

}
