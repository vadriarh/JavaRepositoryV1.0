package glava15;

import java.io.*;
import java.net.*;

public class DailyAdviceServer {

	String[] adviceList = { "����� �������� ��������", "������ ���������� ������. ���, ��� �� ������ ��� ������.",
			"��� �����: �� ��������",
			"������ ������ ���� �� �������. ������� ������ ���������� ���, ��� �� *�� ����� ����* � ��� �������",
			"�������� ��� ����� ��������� ������ ��������." };

	public void go() {
		try {
			ServerSocket serverSock = new ServerSocket(4242);
			while (true) {
				Socket sock = serverSock.accept();
				PrintWriter writer = new PrintWriter(sock.getOutputStream());
				String advice = getAdvice();
				writer.println(advice);
				writer.close();
				System.out.println(advice);
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private String getAdvice() {
		return adviceList[(int) (Math.random() * adviceList.length)];
	}

	public static void main(String[] args) {
		DailyAdviceServer server = new DailyAdviceServer();
		server.go();

	}

}
