package com.thread;

public class test {
	public static void main(String[] args) {
		
		
		job1 jb=new job1();
		jb.start();
		jb.setName("manish");
		job1 jb1=new job1();
		jb1.start();
		jb1.setName("Roshan");
		System.out.println(Thread.currentThread().getName());
	}

}
