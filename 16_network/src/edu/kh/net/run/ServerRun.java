package edu.kh.net.run;

import edu.kh.net.model.service.ServerService;

public class ServerRun {
	public static void main(String[] args) {
		
		// 서버 시작
		new ServerService().serverStart();
		
	}
}
