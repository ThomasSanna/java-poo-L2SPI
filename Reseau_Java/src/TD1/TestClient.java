package TD1;

import java.io.IOException;
import java.net.UnknownHostException;

public class TestClient {

	public static final String DEFAULT_ADDR = "localhost";
	public static final int DEFAULT_PORT = 50007;
	
	
	public static void main(String[] args) {
		
		EchoClient client = new EchoClient();
		try {
		    client.startConnection(DEFAULT_ADDR, DEFAULT_PORT);
		    String response = client.sendMessage("Bien le bonsoir!");
		    System.out.println(response);
		} catch (UnknownHostException e) {
		    e.printStackTrace();
		} catch (IOException e) {
		    e.printStackTrace();
		} finally {
		    try {
		        client.stopConnection();
		    } catch (IOException e) {
		        e.printStackTrace();
		    }
		}
	}
}