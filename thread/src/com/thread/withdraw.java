package com.thread;

public class withdraw {
	public static void main(String[] args) {
		transaction tx=new transaction();
		tx.setName("flipkart");
		tx.start();
		
		transaction tx2=new transaction();
		tx2.setName("amazon");
		tx2.start();
		
	}

}
