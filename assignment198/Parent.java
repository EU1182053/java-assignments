//Create Child Thread of Child.
//also call Thread API functions to change name and priority

// In parent address = "Virar" In child1 address = "Western Line" In child2 address = "Mumbai,Maharshtra"
package assignment198;

public class Parent {
	public static void main(String[] args) {
		
		Address add = new Address();
		Thread mainThread = Thread.currentThread();
		
		System.out.println(mainThread);
		
		String address = "Virar";
		mainThread.setName("Parent");
		mainThread.setPriority(Thread.MAX_PRIORITY);
		System.out.print(mainThread.getName()+"\n"+mainThread.getPriority()+"\n");
		
		try {
			add.address(address);
			
			Child1 ch1 = new Child1();
			ch1.start();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
