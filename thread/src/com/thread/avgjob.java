package com.thread;

public class avgjob extends Thread{
	
		
	@Override
	public void run() {
	
		try {wait();
			Thread1 tt1=new Thread1();
			int average=tt1.sum/10;
			System.out.println(average);
			
		}catch(InterruptedException e) {
			
		}
		
		
	}
	public static void main(String[] args) {
		Thread1 tt=new Thread1();
		tt.start();
		avgjob av=new avgjob();

		av.start();
		
	}
}
