import java.util.ArrayList;

public class collectionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {4,5,3,4,3,2,4,5};
		//Print Unique number
		//Each number repition times 4->3, 5->2, 3->2
		
		ArrayList<Integer>ab=new ArrayList<Integer>();
		for(int i=0;i<a.length;i++)
		{
			int k=0;
			if(!ab.contains(a[i]))
			{
				ab.add(a[i]);
				k++;
				for(int j=i+1;j<a.length;j++)
				{
					if(a[i]==a[j])
					{
						k++;
					}
				}
				System.out.println(a[i]);
				System.out.println(k);
				if(k==1)
				{
					System.out.println(a[i] +"is unique");
				}
			}
			
			
		}
		

	}

}
