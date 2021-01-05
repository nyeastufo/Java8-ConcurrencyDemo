package com.ycic.mthread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BiCounter {
	private int i = 0;
	private int j = 0;
	
	Lock lockForI = new ReentrantLock();
	Lock lockForJ = new ReentrantLock();
	
	//synchronized public void incrementI() {
	public void incrementI() {		// use lock instead of sync to unblock the main thread
		// get lock for I
		lockForI.lock();
		i++;
		// release lock for I
		lockForI.unlock();
	}
	
	public void decrementI() {
		i--;
	}
	
	public int getI() {
		return i;
	}
	
	//synchronized public void incrementJ() {
	public void incrementJ() {		// use lock without sync
		// get lock for J
		lockForJ.lock();
		j++;
		// release lock for J
		lockForJ.unlock();
	}
	
	public void decrementJ() {
		j--;
	}
	
	public int getJ() {
		return j;
	}
}
