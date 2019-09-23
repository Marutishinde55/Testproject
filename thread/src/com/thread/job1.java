package com.thread;

public class job1 extends Thread {
	
	@Override
	public  void run() {
		System.out.println(Thread.currentThread().getName());
	}

}
