
public class methodDemo {

	public static void main(String[] args) {
	methodDemo mdo=new methodDemo();
	mdo.doLoginTest();
	mdo.doLogoutTest();
	System.out.println(mdo.addNumbers(5,15));
	
	

	}
	public void doLoginTest() {
		System.out.println("login successful");
	}
	public void doLogoutTest() {
		doLoginTest();
		System.out.println("logout successful");
	}
	public int addNumbers(int x, int y) {
		
		int z = x+y;
		return z;
	}

}
