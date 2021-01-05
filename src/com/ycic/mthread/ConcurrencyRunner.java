package com.ycic.mthread;

public class ConcurrencyRunner {

	public static void main(String[] args) {
		Counter counter = new Counter();
		
		counter.increment();
		counter.increment();
		counter.increment();
		
		System.out.print("Counter now " + counter.getI());

	}

}
