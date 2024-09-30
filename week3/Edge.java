package week3;

public class Edge extends Browser {

	public void openURL() {
		System.out.println("https://www.facbook.com");
	}
	public static void main(String[] args) {
		Edge e= new Edge();
		e.openURL();
	}
}
