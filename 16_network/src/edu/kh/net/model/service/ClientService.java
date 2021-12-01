package edu.kh.net.model.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ClientService {

	public void clientStart() {
		
		String serverIP = "127.0.0.1"; // Loop Back IP (내 컴퓨터가 내 컴퓨터를 지칭 하는 IP)
		int port = 8500; // 접속할 서버의 포트 번호와 같아야 함!
		
		Socket clientSocket = null;
		InputStream is = null;
		OutputStream os = null;
		BufferedReader br = null;
		PrintWriter pw = null;
		
		try {
			// 1) 서버의 IP주소와 서버가 정한 포트 번호를 매개변수로 하여 클라이언트용 소켓 객체 생성
			clientSocket = new Socket(serverIP, port);
			// clientSocket이 서버의 ServerSocket으로 연결(접속)을 요청
			
			// 2) 서버와의 입출력 스트림 오픈
			if(clientSocket != null) { // 서버와의 접속이 수락되서 소켓 객체가 생성된 경우
				is = clientSocket.getInputStream();
				os = clientSocket.getOutputStream();
				
				// 3) 보조 스트림을 통해 성능 향상
				br = new BufferedReader( new InputStreamReader(is) );
				pw = new PrintWriter(os);
				
				// 4) 스트림을 통해 읽고 쓰기
				
				// 서버 -> 클라이언트로 전달 받은 메세지 읽어 들임
				String message = br.readLine();
				System.out.println(message);
				
				// 서버 <- 클라이언트로 메세지 쓰기(전달)
				//pw.println("아메리카노 하나 주세요.");
				
				// 클라이언트가 작성한 메세지 전달
				Scanner sc = new Scanner(System.in);
				System.out.print("입력 > ");
				pw.println( sc.nextLine() );
				
				pw.flush();
			}
			
		}catch (UnknownHostException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
		
		finally {
			// 5) 통신 종료
			// 스트림, 소켓 닫기
			
			try {
				if(br != null) br.close();
				if(pw != null) pw.close();
				if(clientSocket != null) clientSocket.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
			
		}
		
		
		
		
	}
	
}
