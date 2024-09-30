package week3;

public class LoginTestData extends TestData{

	public void enterUsername() {
		System.out.println("kousthu");
	}

    public void enterPassword() {
    	System.out.println("passcode");
	}
    
    public static void main(String[] args) {
		LoginTestData l= new LoginTestData();
		l.enterCredentials();
		l.navigatToHompage();
		l.enterPassword();
		l.enterUsername();
	}
}
