import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class hashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(0, "Hello");
		hm.put(22, "Hii");
		hm.put(2, "Byeee");
		System.out.println(hm.get(2));
		
		//HashMap to Set Conversion
		Set sm=hm.entrySet(); //here both key and value will be stored
		Iterator i=sm.iterator();
		
		while(i.hasNext())
		{
			Map.Entry mp=(Map.Entry)i.next();
			System.out.println(mp.getKey());
			System.out.println(mp.getValue());
		}
		
		

	}

}
