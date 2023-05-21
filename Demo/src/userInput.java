import java.util.Scanner;
public class userInput {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		System.out.println("enter the name");
		String name = s.next();
		System.out.println("enter the gender either M or F");
		char g =s.next().charAt(0);
		System.out.println("enter the age od the user");
		int age= s.nextInt();
		System.out.println("the gender entered by you is " +g);
		System.out.println("the age entered by you is " +age);
		System.out.println("the name entered by you is " +name);

	}

}
