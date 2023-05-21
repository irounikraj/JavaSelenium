import java.util.Scanner;

public class recverseInteger {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter teh number");
		int num = scanner.nextInt();
		String st = Integer.toString(num);
		int n = st.length();
		
		for (int i=n-1; i>=0; i--)
		{
			System.out.println(st.charAt(i));
		}

	}

}
