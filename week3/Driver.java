package week3;

public class Driver {

	public void loadUrl(String url, boolean status) {
		System.out.println(url+""+status);
	}
	public void loadUrl(String url) {
		System.out.println(url);
	}
public static void main(String[] args) {
	Driver d = new Driver();
	d.loadUrl("https://www.facebook.com/",true);
	d.loadUrl("https://www.twitter.com/");
}

}

