package com.nt;

public class TestSendMessage {


	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		SendMessage message=new SendMessage();
		Thread1 thread1=new Thread1(message);
		Thread2 thread2=new Thread2(message);
		thread1.start();
		thread1.join(10000);
		thread2.start();
		

	}

}
