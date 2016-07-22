package vna03_J_NCEAR;

import java.math.BigInteger;

public class TestThread implements Runnable {

	public void run() {
		BigInteger a = new BigInteger(String.valueOf((int)(Math.random()*9+10)));
		BigInteger a1 = new BigInteger(String.valueOf((int)(Math.random()*9+10)));

		BigInteger b = new BigInteger(String.valueOf((int)(Math.random()*9+10)));
		BigInteger b1 = new BigInteger(String.valueOf((int)(Math.random()*9+10)));

		Adder test = new Adder(a,b);
		test.update(a1, b1);
		BigInteger result = test.add();
     	System.out.println(a+" "+b+" "+a1+"+"+b1+"="+result);
	}
	public static void main(String[] args) throws Exception { 
		
		TestThread t = new TestThread();
		Thread t1 = new Thread(t);
		Thread t2 = new Thread(t);
		Thread t3 = new Thread(t);
		t1.start();
		t2.start();
		t3.start();
	}
}
