import java.util.Scanner;

public class reverseString {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the string:");

		String st = scanner.nextLine();
		String st = scanner.nextLine();
		int n = st.length();

		System.out.println("the reversed string is");

		for (int i = n - 1; i >= 0; i--) {
			System.out.println(st.charAt(i));
		}

	}

}
