package com.atguigu.homework.exer5;

import java.io.Serializable;

/**
 * @author lystart
 * @create 2023-02-27 20:18
 */
public class Message implements Serializable {
    private static final long serialVersionUID = 1L;
    private String fromUser;// 发送者
    private String toUser;// 接收者
    private String content;// 消息内容
    private long sendTime;// 发送时间

    public Message() {
    }

    public Message(String fromUser, String toUser, String content, long sendTime) {
        this.fromUser = fromUser;
        this.toUser = toUser;
        this.content = content;
        this.sendTime = sendTime;
    }

    public String getFromUser() {
        return fromUser;
    }

    public void setFromUser(String fromUser) {
        this.fromUser = fromUser;
    }

    public String getToUser() {
        return toUser;
    }

    public void setToUser(String toUser) {
        this.toUser = toUser;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public long getSendTime() {
        return sendTime;
    }

    public void setSendTime(long sendTime) {
        this.sendTime = sendTime;
    }

    @Override
    public String toString() {
        return "Message{" +
                "fromUser='" + fromUser + '\'' +
                ", toUser='" + toUser + '\'' +
                ", content='" + content + '\'' +
                ", sendTime=" + sendTime +
                '}';
    }
}
