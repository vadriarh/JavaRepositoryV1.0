package glava15;

import java.io.*;
import java.net.*;

public class DailyAdviceClient {

	public void go() {
		try {
			Socket s = new Socket("127.0.0.1", 4242);
			
			InputStreamReader streamreader = new InputStreamReader(s.getInputStream());
			BufferedReader reader = new BufferedReader(streamreader);

			String advice = reader.readLine();
			System.out.println("������� �� ������: " + advice);
			
			reader.close();
			s.close();

		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		DailyAdviceClient client = new DailyAdviceClient();
		client.go();

	}

}
