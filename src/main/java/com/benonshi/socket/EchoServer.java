package com.benonshi.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;


public class EchoServer {

    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = null;
        try {
            //创建服务器Socket
            serverSocket = new ServerSocket(9999);
        } catch (IOException e) {
            System.err.println("Could not listen on port: 9999.");
            System.exit(1);
        }

        Socket clientSocket = null;
        try {
            //监听到此套接字的请求，并创建新的套接字，使用新的套接字与客户端通信
            clientSocket = serverSocket.accept();
            System.out.println("The server port is :" + clientSocket.getLocalPort());
            System.out.println("The client port is :" + clientSocket.getPort());
        } catch (IOException e) {
            System.err.println("Accept failed.");
            System.exit(1);
        }

        PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
        BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        String inputLine = null;
        //out.println(outputLine);

        System.out.println(inputLine);
        while ((inputLine = in.readLine()) != null) {
            out.println(inputLine);
            System.out.println(inputLine);
            if (inputLine.equals("Bye")) {
                break;
            }
        }
        out.close();
        in.close();
        System.out.println("服务端连接已关闭");
        clientSocket.close();
        serverSocket.close();

    }

}
