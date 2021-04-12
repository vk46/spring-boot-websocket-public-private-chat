package com.vk.websocket.model;

/**
 * @author vk
 *
 */
public class ChatMessage {
	
    private MessageType type;
    private String content;
    private String sender;
    private String receiver;

    public ChatMessage() {
    	
	}

	public ChatMessage(MessageType type, String content, String sender, String receiver) {
		this.type = type;
		this.content = content;
		this.sender = sender;
		this.receiver = receiver;
	}

	public MessageType getType() {
        return type;
    }

    public void setType(MessageType type) {
        this.type = type;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

	public String getReceiver() {
		return receiver;
	}

	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}

}
