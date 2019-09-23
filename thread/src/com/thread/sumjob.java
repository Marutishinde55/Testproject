package com.thread;

public class sumjob extends Thread {
	static float sum=0,count;
	public void run() {
		
		for(int i=1;i<=55;i++) {
			 sum=sum+i;
			  count=i;
		}
System.out.println(sum);
	}

}
