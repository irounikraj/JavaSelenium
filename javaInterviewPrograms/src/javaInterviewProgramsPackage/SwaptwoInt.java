package javaInterviewProgramsPackage;

public class SwaptwoInt {

	public static void main(String[] args) {
		int x=10;
		int y = 50;
		// using temp variable for swapping
	//	int t;
		//t=x;//t =10
		//x=y;//x=50
		//y=t;//y =10
		//System.out.println(x);
		//System.out.println(y);
		
		// without using temp
		
		//x=x+y;//x=60
		//y=x-y;//y=10
		//x=x-y;//x=50
		
		//System.out.println(x);
		//System.out.println(y);
		//using * operator
		
		x=x*y;//x=500
		y=x/y;//y=10
		x=x/y;//x=50
		System.out.println(x);
		System.out.println(y);
	
		
		

	}

}
