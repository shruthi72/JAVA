
public class charRemove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input="elephant";
		String newWord="";

		for(int i=0;i<input.length();i++)
		{
		char ch=input.charAt(i);

		if(!(ch=='e'))
		{
			newWord+=ch;
		}
		}
		System.out.println(newWord);
		}


	}


