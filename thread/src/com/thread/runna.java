package com.thread;

public class runna extends Thread{

	@Override
	public void run() {
		System.err.println(Thread.currentThread().getName());
		//System.out.println("in job thread");
		
	}
	

}
