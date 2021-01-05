package com.ycic.mthread;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BiCounterWithAtomic {
	// private int i = 0;
	private AtomicInteger i = new AtomicInteger();
	//private int j = 0;
	private AtomicInteger j = new AtomicInteger();		// use this to remove the lock
	
	Lock lockForI = new ReentrantLock();
	Lock lockForJ = new ReentrantLock();
	
	//synchronized public void incrementI() {
	public void incrementI() {		// use lock instead of sync to unblock the main thread
		// get lock for I
		//lockForI.lock();
		//i++;						// can not use i++ for AtomicInteger
		i.incrementAndGet();
		// release lock for I
		//lockForI.unlock();
	}
	
	public void decrementI() {
		//i--;
		i.decrementAndGet();
	}
	
	public int getI() {
		//return i;
		return i.get();			// can not return i, must use atomic to get
	}
	
	//synchronized public void incrementJ() {
	public void incrementJ() {		// use lock without sync
		// get lock for J
		//lockForJ.lock();
		//j++;
		j.incrementAndGet();
		// release lock for J
		//lockForJ.unlock();
	}
	
	public void decrementJ() {
		//j--; 
		j.decrementAndGet();
	}
	
	public int getJ() {
		//return j;
		return j.get();
	}
}
