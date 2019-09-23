package com.thread;

public class transaction extends Thread{
	 static int balance=1000;
	
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			withdraw(200);
		}
	}
//make static because its taking two memory spaces in object creation
	//synchronized for to enter only one thread at a time
	static private synchronized void   withdraw(int amt) {
		System.out.println("trying to withdraw>>"+Thread.currentThread().getName());
		if(balance>100) {
		balance=balance-amt;
		System.out.println("balance remained in account >>"+balance);
		}else {
			System.out.println("insufficient balance");
		}
	}

}
