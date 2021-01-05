package com.ycic.mthread;

public class Counter {
	private int i = 0;
	
	synchronized public void increment() {
		i++;
	}
	
	public void decrement() {
		i--;
	}
	
	public int getI() {
		return i;
	}
}
