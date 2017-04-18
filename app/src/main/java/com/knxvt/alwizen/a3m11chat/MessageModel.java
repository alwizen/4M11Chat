package com.knxvt.alwizen.a3m11chat;

import java.util.Date;

/**
 * Created by alwizen on 10/12/2016.
 */

public class MessageModel {
    private String messageText;
    private String messageUser;
    private long messageTime;

    public MessageModel(String messageText, String messageUser) {
        this.messageText = messageText;
        this.messageUser = messageUser;
        messageTime = new Date().getTime();
    }

    public MessageModel(){

    }

    public String getMessageText() {
        return messageText;
    }

    public void setMessageText(String messageText) {
        this.messageText = messageText;
    }

    public String getMessageUser() {
        return messageUser;
    }

    public void setMessageUser(String messageUser) {
        this.messageUser = messageUser;
    }

    public long getMessageTime() {
        return messageTime;
    }

    public void setMessageTime(long messageTime) {
        this.messageTime = messageTime;
    }
}
