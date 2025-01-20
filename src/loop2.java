
public class loop2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
				System.out.print("\t");
			}
			System.out.print("\n");
		}
		/*int k=1;
		for (int i=1;i<=3;i++)
		{
			for(int j=i;j<=i;j++)
			{
				System.out.print(j*k);
				k++;
				System.out.print("\t");
			}
			System.out.print("\n");
		}*/

	}

}

/*1
1 2
1 2 3
1 2 3 4

3
6 9
12 15 18

*/