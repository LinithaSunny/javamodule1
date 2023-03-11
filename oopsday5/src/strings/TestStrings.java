package strings;

public class TestStrings {

	public static void main(String[] args) {
		
		byte bytes[] = {65,66,67,68,69};
		
		String str = new String(bytes);
		System.out.println(str.length());
		System.out.println(str);
		str = "Welcome to UST Global";
		
		bytes = str.getBytes();
		for(byte b: bytes) {
			System.out.println(b);
		}
		
		char chars[] = {'U','S','T',' ','G'};
		str = new String(chars);
		System.out.println(str);
		
		str.getChars(0, chars.length-1, chars, 0);
		for(char c:chars) {
			System.out.println(c);
		}
		
		String string = new String("She sells sea shells on the sea shore");
		String s = string;
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i) == 's' || s.charAt(i) == 'S')
			{
				count++;
			}
		}
		System.out.println("Number of S in the string = "+count);
		
		
		String words[] = string.split(". ");
		System.out.println(words.length);
		
		for(String word: words)
		{
			System.out.println(word);
		}
		string = new String("Cartoon");
		System.out.println(string.startsWith("Car"));
		System.out.println(string.endsWith("toon"));
		
		
		int apos = string.indexOf('a');
		int tpos = string.indexOf('t');
		System.out.println(apos);
		System.out.println(tpos);
		
		
		String string2 = string.substring(apos, tpos);
		System.out.println(string2);
		
		string2 = string .substring(tpos);
		System.out.println(string2);
		
		
		string = new String("madamdam");
		int mpos = -1;
		int dpos = string.indexOf('d',-1);
		string2 = string.substring(dpos, string.length());
		System.out.println(string2);
		
		String str1 = new String("welcome");
		String str2 = new String("WELCOME");
		boolean result = str1.equalsIgnoreCase(str2);
		System.out.println(result);
		
		int val = str2.compareTo(str1);
		System.out.println(val);
		
		string = "DieHARD";
		System.out.println((string.toLowerCase()));
		System.out.println(string);
		System.out.println(string.toUpperCase());
		
//		strings are immutable
		
		string = "lin@..;123okay";
		int a=0,b=0,c=0;
		for(int i=0;i<string.length();i++)
		{
			char ch = string.charAt(i);
			if(Character.isDigit(ch))
			{
				a++;
			}
			else if(Character.isLetter(ch))
			{
				b++;
			}
			else {
				c++;
			}
			
		}
		System.out.println("Number of digits: "+a);
		System.out.println("Number of letters: "+b);
		System.out.println("Number of other characters: "+c); 
		
		
		
		
		
		
		 
}
}
