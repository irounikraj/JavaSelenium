import java.util.Scanner;
public class factorialPract {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the number you want factorial for");
		int num =sc.nextInt();
		int fact = 1;
		for(int i =1; i<=num;i++) {
			fact =fact*i;
			
	
		}
		System.out.println("factorial of the entered number is: " +fact);

	}

}
