package assignment198;

public class Child1 extends Thread {
	
	public Child1(){}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		Thread child1 = Thread.currentThread();
		System.out.println(child1+"thread started.");
		
		child1.setName("child-1");
		child1.setPriority(Thread.MAX_PRIORITY-2);
		
		System.out.println(child1.getName()+" thread started. With priority "+child1.getPriority());
		
//		Thread child2 = Thread.currentThread();
//		

		Address add = new Address();
		try {
			add.address("Western Line");
			
			Child2 child2 = new Child2();
			
			child2.start();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}
	
}
