package Stringlearning;

public class Stringbasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "sukumar";
		s = s.toUpperCase();
		System.out.println(s);
		
		s = s.toLowerCase();
		System.out.println(s);
		
		//convertToUpper(s);
		s = "SUKUMAR";
		convertToLower(s);

	}

	private static void convertToLower(String s) {
		// TODO Auto-generated method stub
		for(int i=0;i<s.length();i++)
		{
			char ch = s.charAt(i);
		
			if(i%2==0)
			{
			
			System.out.println((char)(ch+32));
		}
			else
			System.out.println(ch);	
		}
	}

	private static void convertToUpper(String s) {
		// TODO Auto-generated method stub
		for(int i=0;i<s.length();i++)
		{
			char ch = s.charAt(i);
			System.out.println((char)(ch-32));
		}
	}

}
