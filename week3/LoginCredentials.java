package week3;

public class LoginCredentials extends TestData {

	public void enterUsername() {
		System.out.println("kousthuban");
	}
   
	public void enterPassword() {
		System.out.println("enclosed");
	}
	
	public static void main(String[] args) {
		LoginCredentials c= new LoginCredentials();
		c.enterCredentials();
		c.navigatToHompage();
		c.enterUsername();
		c.enterPassword();
		
	}
}
