
public class lexicoString {

	public String smallestString(String s) {
        int n = s.length();
        int i = 0;
        while (i < n && s.charAt(i) == 'a') {
            ++i;
        }
        if (i == n) {
            return s.substring(0, n - 1) + "z";
        }
        int j = i;
        char[] cs = s.toCharArray();
        while (j < n && cs[j] != 'a') {
            cs[j] = (char) (cs[j] - 1);
            ++j;
        }
        return String.valueOf(cs);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		lexicoString ls=new lexicoString();
		String s="acbbc";
		System.out.println(ls.smallestString(s));

	}

}
