package com.iu.api5.thread;

public class ThreadTest2 extends Thread{
	
	public void run() {
		this.t2();

	}
	public void t2() {
		for(int i='A';i <='Z';i++) {//형변환
			System.out.println("T2 : "+(char)i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
