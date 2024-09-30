package week3;

public class Chrome extends Browser {

	  public void openIncognito() {
		  System.out.println("opened");
	}
	  public void clearCache() {
		  System.out.println("cleared");
		  
	}
	  public static void main(String[] args) {
		Chrome c= new Chrome();
		c.openIncognito();
		c.clearCache();
		c.openURL();
		c.closeBrowser();
		c.navigateBrowser();
	}
}
