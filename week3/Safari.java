package week3;

public class Safari extends Browser {

	public void takeSnaps() {
		System.out.println("taken");
	}
	public void clearCookies() {
		System.out.println("cleared");
	}
	public static void main(String[] args) {
		Safari s= new Safari();
		s.takeSnaps();
		s.clearCookies();
		s.openURL();
		s.closeBrowser();
		s.navigateBrowser();
	}
}
