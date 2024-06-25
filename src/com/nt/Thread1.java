package com.nt;

public class Thread1 extends Thread {
	
	SendMessage sendMessage;
	
	public Thread1(SendMessage sendMessage) {
		super();
		this.sendMessage = sendMessage;
	}
	

	public SendMessage getSendMessage() {
		return sendMessage;
	}


	public  void setSendMessage(SendMessage sendMessage) {
		this.sendMessage = sendMessage;
	}


	@Override
	public void run() {
		System.out.println("Thread1 is running");
		sendMessage.send("Pawan", "Welcome to Thread1 ");
	}


	@Override
	public String toString() {
		return "Thread1 [sendMessage=" + sendMessage + "]";
	}
	

}
