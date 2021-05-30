package com.benonshi.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
 
 
public class EchoClient {
 
	public static void main(String[] args) throws IOException {
		Socket echoSocket = null;
	    PrintWriter out = null;
	    BufferedReader in = null;
 
	    try {
	    	//创建连接到服务器的Socket，需要指定主机名和端口号
	        echoSocket = new Socket("localhost", 9999);
	        System.out.println("The server port is :" + echoSocket.getPort());
            System.out.println("The client port is :" + echoSocket.getLocalPort());
            //打开该Socket的输出流，使用该输出流写数据
	        out = new PrintWriter(echoSocket.getOutputStream(), true);
	        //打开该Socket的输入流，使用该流读取数据
	        in = new BufferedReader(new InputStreamReader(echoSocket.getInputStream()));
	    } catch (UnknownHostException e) {
	        System.err.println("Don't know about host: localhost.");
	        System.exit(1);
	    } catch (IOException e) {
	        System.err.println("Couldn't get I/O for the connection to: localhost.");
	        System.exit(1);
	    }


		BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));
		String userInput;
        while ((userInput = stdIn.readLine()) != null) {
		    out.println(userInput);
		    System.out.println("echo: " + in.readLine());
		}

		//在关闭Socket之前关闭与之关联的输入输出流 
		out.close();
		in.close();
		stdIn.close();
        System.out.println("客户端连接已关闭");
		echoSocket.close();
	    }
	}
