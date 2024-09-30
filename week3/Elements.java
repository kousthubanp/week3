package week3;

public class Elements {

	public void click() {
		System.out.println("clicked");
	}
	
	public void setText(String text) {
		System.out.println(text);
	}
	
	public void submit() {
		System.out.println("submitted");
	}
	
	public void getText() {
		System.out.println("text");
	}
	
	public void clickCheckButton() {
		System.out.println("CheckButton clicked");
	}
	
	public void selectRadioButton() {
		System.out.println("RadioButton selected");
	}
	public static void main(String[] args) {
		Elements E= new Elements();
		E.click();
		E.setText("kousthu");
		E.submit();
		E.getText();
		E.clickCheckButton();
		E.selectRadioButton();
		
	}

}
