
public class reverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="suruthi";
		String revStr="";
		int len=str.length();
		for(int i=0;i<len;i++)
		{
			
			revStr=str.charAt(i)+revStr;
		}
		System.out.println(revStr);

	}

}
