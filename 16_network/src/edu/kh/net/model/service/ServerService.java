package edu.kh.net.model.service;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ServerService {
	
	/* TCP
	 * - 서버, 클라이언트간의 1:1 소켓 통신(연결 지향적 프로토콜)
	 * 
	 * Socket : 프로세스간의 양 끝단
	 * == 프로세스간의 통신을 담당.
	 * 서버 - 소켓 - 클라이언트  -> 소켓은 input/outputStream을 보유
	 * 					   -> 이 Stream을 통해 프로세스간의 데이터 통신이 이루어짐
	 * 
	 * ServerSocket : 서버용 소켓
	 * - 포트와 연결되어 외부 요청을 기다리는 역할
	 *   -> 클라이언트의 요청이 올 경우 이를 수락하고 
	 *      클라이언트가 사용할 수 있는 소켓 객체를 생성
	 *      --> 서버용 소켓과 클라이언트용 소켓이 연결되어 통신이 이루어진다.
	 * */
	
	
	public void serverStart() {
		// 1) 서버의 포트번호를 정함
		int port = 8500; // 서버 프로그램의 포트 번호
		// 포트는 0 ~ 65535 사이 수로 지정 가능(단, 1023 이하는 사용 지양)
		
		InputStream is = null; // 서버 <- 클라이언트
		OutputStream os = null; // 서버 -> 클라이언트
		
		BufferedReader br = null; // InputStream의 보조 스트림
		PrintWriter pw = null; // OutputStream의 보조 스트림
		
		ServerSocket serverSocket = null; // 서버용 소켓
		Socket clientSocket = null; // 클라이언트용 소켓
		
		try {
			// 2) 서버용 소켓 객체 생성
			serverSocket = new ServerSocket(port);
			// 8500번 포트로 들어오는 요청에 대한 서버용 소켓이 생성됨
			
			// 3) 클라이언트의 요청이 오길 기다림
			System.out.println("[Server]");
			System.out.println("클라이언트의 요청을 기다리는 중 ...");
			
			// 4) 접속 요청이 오면 요청 수락 후 해당 클라이언트에 대한 소켓 객체 생성
			clientSocket = serverSocket.accept();
			
			// 요청한 클라이언트의 아이피 주소 얻어오기
			String clientIP = clientSocket.getInetAddress().getHostAddress();
			System.out.println(clientIP + "가 연결을 요청함!");
			
			// 5) 연결된 클라이언트와 입출력 스트림 생성
			is = clientSocket.getInputStream();
			os = clientSocket.getOutputStream();
			
			// 6) 보조 스트림을 통해 성능 개선
			// InputStreamReader : 바이트 기반 스트림을 문자 기반 스트림으로 변환하는 객체
			br = new BufferedReader( new InputStreamReader(is)  );
			pw = new PrintWriter(os);
			
			
			// 7) 스트림을 통해서 읽고 쓰기
			
			// 서버 -> 클라이언트로 메세지 전송
			Date now = new Date(); // 현재 시간이 Date 객체에 저장됨
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			String time = sdf.format(now) + "[서버 접속 성공]";
			
			pw.println( time ); // 클라이언트 쪽으로 time에 저장된 문자열을 출력하겠다
			pw.flush(); // 스트림에 있는 내용을 밀어냄
			
			
			// 서버 <- 클라이언트로 전달한 메세지 읽기
			String message = br.readLine(); // 클라이언트로 부터 전달 받은 메세지를 한 줄 읽음
			System.out.println("클라이언트가 전달한 메세지 : " + message);
			
			
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			// 8) 통신 종료
			// 열려있는 스트림, 소켓을 닫기(== 사용한 자원 반환)
			
			try {
				// 보조스트림을 닫으면 연결되어있던 기반 스트림도 같이 닫힌다!
				if(br != null) br.close(); // is.close(); 같이 수행됨
				if(pw != null) pw.close(); // os.close(); 같이 수행됨
				
				if(serverSocket != null) serverSocket.close();
				if(clientSocket != null) clientSocket.close();
				
			}catch(IOException e) {
				e.printStackTrace();
			}
			
		}
	}
}
