package javaInterviewProgramsPackage;
import java.lang.StringBuffer;
public class StringReverse {

	public static void main(String[] args) {
		String s ="Rounik";
		int len =s.length();
		String rev="";
		for(int i=len-1;i>=0;i--) {
			rev = rev+s.charAt(i);
			System.out.println(s.charAt(i));
			
		}
System.out.println(rev);
//using string buffer class
	StringBuffer sf = new StringBuffer();
	System.out.println(sf.reverse());
	}
	
	
	
	

	
	
	
	

}
