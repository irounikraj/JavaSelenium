package javaInterviewProgramsPackage;

public class LargestSmallestNo {

	public static void main(String[] args) {
		int num[]= {-10, 30, 20, 50, 110, 75, 1,100 };
		int smallest = num[0];
		int largest = num[0];
		for(int i=1; i<num[i];i++) {
			if (num[i]> largest) {
				largest= num[i];
			}
			else if(num[i]<smallest) {
				smallest=num[i];
						}
			}
		System.out.println("/n the samllest number is "+smallest);
		System.out.println("/ln the largest number is "+largest);
		

	}

}
