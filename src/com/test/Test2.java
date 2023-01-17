package com.test;

public class Test2 extends Thread {

	public void run() {
		for (int i = 0; i <= 5; i++) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {

		Test2 test2 = new Test2();
		test2.start();

	}

}
