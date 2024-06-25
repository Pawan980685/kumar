package com.nt;

public class Thread2 extends Thread {
	
    SendMessage sendMessage;
	
	public Thread2(SendMessage sendMessage) {
		super();
		this.sendMessage = sendMessage;
	}
	

	public SendMessage getSendMessage() {
		return sendMessage;
	}


	public void setSendMessage(SendMessage sendMessage) {
		this.sendMessage = sendMessage;
	}


	@Override
	public void run() {
		System.out.println("Thread2 is running");
		sendMessage.send("Pawan", "Welcome to Thread2 ");
	}


	@Override
	public String toString() {
		return "Thread2 [sendMessage=" + sendMessage + "]";
	}
	


}
