package com.nt;

public class SendMessage {
	
	private String mgs;
	private String name;
	public SendMessage(String mgs, String name) {
		super();
		this.mgs = mgs;
		this.name = name;
	}
	
	/*
	 * // Synchroniza method public synchronized void send(String mgs, String name)
	 * { try { for (int i = 0; i < 3; i++) { Thread.sleep(1000);
	 * System.out.println(name + " :" + mgs); } } catch (Exception e) {
	 * System.out.println(e.getMessage()); }
	 * 
	 * }
	 */
	
	/*
	 * //Synchroniza block public void send(String mgs,String name) {
	 * synchronized(this) { try { for(int i=0;i<3;i++) { Thread.sleep(1000);
	 * System.out.println(name+ " :" +mgs); } } catch (Exception e) {
	 * System.out.println(e.getMessage()); } }
	 * 
	 * }
	 */
	//static Synchroniza
			public static synchronized  void send(String mgs,String name) {
				
				try {
					for(int i=0;i<3;i++) {
						Thread.sleep(1000);
						System.out.println(name+ " :" +mgs);	
					}
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			}
	public String getMgs() {
		return mgs;
	}
	public void setMgs(String mgs) {
		this.mgs = mgs;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public SendMessage() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "SendMessage [mgs=" + mgs + ", name=" + name + "]";
	}
	
	

}
