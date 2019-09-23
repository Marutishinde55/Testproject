package com.thread;

public class joinMAin {
	public static void main(String[] args) throws InterruptedException  {
		sumjob s1=new sumjob();
		s1.start();
		s1.join();
		avgjob av=new avgjob();
		av.start();
	}

}
