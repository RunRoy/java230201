package com.atguigu.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class TestClient {
    public static void main(String[] args) {
        // 客户端
        try{
            Socket socket = new Socket("localhost",8888);
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            bw.write("你好，服务器，我是客户端，我向你发送了请求");
            bw.flush();
            socket.shutdownOutput();
            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String s = br.readLine();
            System.out.println("这里是客户端，服务器的响应信息是："+s);
            br.close();
            socket.close();
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
