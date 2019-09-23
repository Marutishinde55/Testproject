package com.thread;

public class Thread1 extends Thread {
	static int sum=0,count;
	public void run() {
		
			sum1();
		

	}
synchronized public void sum1() {
		for(int i=1;i<=100000;i++) {
			 sum=sum+i;
			  count=i;
		}
System.out.println("sum>>>"+sum);

	
	}

}
