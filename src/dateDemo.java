import java.text.SimpleDateFormat;
import java.util.Date;

public class dateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d=new Date();
		
		
		SimpleDateFormat sdf=new SimpleDateFormat("M/d/yyyy");
		
		SimpleDateFormat sd=new SimpleDateFormat("M/d/yyyy hh:mm:ss");
		
		//above line now will have mm/dd/yyyy format but object is d
		System.out.println(sdf.format(d));
		System.out.println(sd.format(d));
		
		//System.out.println(d); -> invalid as d is pointing to object. so use below
		System.out.println(d.toString());
		
		// mm//dd//yyyy HH:MM:SS
		

	}

}
