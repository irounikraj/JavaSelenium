package javaInterviewProgramsPackage;

public class ReverseInteger {

	public static void main(String[] args) {
		int org= 5348297;
		int rev =0;
		
	while (org!=0) {
		
		rev =rev*10 +org%10;
	org=org/10;
		
	}
	System.out.println(rev);
	}

}
