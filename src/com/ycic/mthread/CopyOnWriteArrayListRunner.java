package com.ycic.mthread;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListRunner {

	public static void main(String[] args) {
		List list = new CopyOnWriteArrayList<String>();

		// threads - 3
		list.add("Ant");
		list.add("Bat");
		list.add("Cat");
		
		// threads - 10000
		for (Object element : list) {
			System.out.println(element.toString());
		}
	}

}
