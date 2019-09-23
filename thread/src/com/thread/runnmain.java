package com.thread;

public class runnmain {
	public static void main(String[] args) {
		runna ab=new runna();
		ThreadGroup ab1=new ThreadGroup("ab1");
		ab1.setMaxPriority(10);
		Thread tt=new Thread(ab1,ab,"T1");
		Thread tt1=new Thread(ab,"T2");
		Thread tt2=new Thread(ab,"T3");
		Thread tt3=new Thread(ab1,ab,"T4");
		Thread tt4=new Thread(ab,"T5");
		Thread tt5=new Thread(ab,"T6");
		tt.start();
		tt1.start();
		tt2.start();
		tt3.start();
		tt4.start();
		tt5.start();
	}

}
