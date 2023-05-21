import java.util.Scanner;

public class reverseNumberusingpercent {

	public static void main(String[] args) {
	Scanner scanner =new Scanner(System.in);
	System.out.println("enter the number");
	int actualno =scanner.nextInt();
	int reverse=0;
	
	while(actualno!=0) {
		int rem= actualno%10;
		reverse =reverse*10 +rem;
		actualno=actualno/10;
		
		
	}
	System.out.println("reversed number"+reverse);
	
	}

}
