
public class methodLogin {

	public static void main(String[] args) {
		methodLogin md = new methodLogin();
		md.doLogin();
		
		
		
		md.doLogin();md.doLogin();md.doLogin();md.doLogin();md.doLogin();
	}

	public void doLogin() {
		System.out.println("do login");
	}

	public void doLogout() {
		doLogin();
		System.out.println("do logout");

	}

}
