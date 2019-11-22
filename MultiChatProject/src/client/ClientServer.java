package client;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;


public class ClientServer {
	
	public ClientServer(){
		String serverIp = "127.0.0.1";
		
		Scanner sc = new Scanner(System.in);
		System.out.print("��ȭ���� �Է��ϼ��� : ");
		String name = sc.nextLine();
		
		try {
			Socket socket = new Socket(serverIp, 8888);
			System.out.println("������ ���� �Ǿ����ϴ�.");
			Thread sender = new Thread(new ClientSender(socket, name));
			Thread receiver = new Thread(new ClientReceiver(socket));
			sender.start();
			receiver.start();
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
