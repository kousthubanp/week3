package week3;

public class APIClient {

	public void sendRequest(String endpoint) {
		System.out.println(endpoint);
	}
	
	public void sendRequest(String endpoint, String requestBody, boolean requestStatus ) {
		System.out.println(endpoint+" "+requestBody+" "+requestStatus);
	}
	public static void main(String[] args) {
		APIClient a= new APIClient();
		a.sendRequest("data");
		a.sendRequest("type", "testleaf",true);
	}
		
	

}
