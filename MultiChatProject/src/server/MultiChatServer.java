package server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

public class MultiChatServer {
	private HashMap clients;
	
	public MultiChatServer(){
		clients = new HashMap();
		Collections.synchronizedMap(clients);
	}
	
	class ServerReceiver extends Thread{
		private Socket socket;
		private DataInputStream in;
		private DataOutputStream out;
		
		public ServerReceiver(Socket socket){
			this.socket = socket;
			try {
				this.in = new DataInputStream(socket.getInputStream());
				this.out = new DataOutputStream(socket.getOutputStream());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		public void run(){
			String name = null;
			
			try {
				name = in.readUTF();
				sendToAll(name, "#" + name + "님이 들어오셨습니다.");
				clients.put(name, out);
				System.out.println("현재 서버접속자 수는 " + clients.size() + "입니다.");
				while(in != null){
					//System.out.println(in.readUTF());
					sendToAll(name, in.readUTF());
				}
				
			} catch (IOException e) {
				e.printStackTrace();
			}finally {
				sendToAll(name, "#" + name + "님이 나가셨습니다.");
				clients.remove(name);
				System.out.println("현재 접속자 수는 " + clients.size() + "입니다.");
			}
			
		}

		
		
	}

	
	public void start(){
		ServerSocket serverSocket = null;
		Socket socket = null;
		
		try {
			serverSocket = new ServerSocket(8888);
			System.out.println("서버가 시작 되었습니다.");
			
			while(true){
				socket = serverSocket.accept();
				System.out.println("새로운 유저가 로그인 하였습니다.");
				ServerReceiver thread = new ServerReceiver(socket);
				thread.start();
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void sendToAll(String name, String msg){
		Iterator it = clients.keySet().iterator();
		while(it.hasNext()){
			try {
				String userName = (String) it.next();
				if(!userName.equals(name)) {
					DataOutputStream out = (DataOutputStream) clients.get(userName);
					out.writeUTF(msg);
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}
