package com.atguigu.test2;

import java.io.*;
import java.net.Socket;

public class ServerThread extends Thread{
    private Socket socket;
    public ServerThread(Socket socket){
        this.socket = socket;
    }
    @Override
    public void run() {
        try{
            // 从socket对象上获取一个输入流用于读取socket上数据
            ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
            User user = (User)ois.readObject();
            ResultInfo resultInfo = new ResultInfo();
            if(user.getUserName().equals("Tom")
                    &&user.getUserPwd().equals("123456")){
                resultInfo.setFlag(true);
                resultInfo.setInfo("恭喜用户登录成功");
            }else{
                resultInfo.setFlag(false);
                resultInfo.setInfo("用户名或密码错误，请重新登录");
            }
            socket.shutdownInput();// 关闭输入流，准备开启输出流
            ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
            oos.writeObject(resultInfo);
            oos.flush();
            oos.close();
            socket.close();
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
