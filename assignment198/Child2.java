package assignment198;

public class Child2 extends Thread {
	
	public Child2(){}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		Thread child2 = Thread.currentThread();
		System.out.println(child2+"thread started.");
		
		child2.setName("child-1");
		child2.setPriority(Thread.MAX_PRIORITY-1);
		

//		
		System.out.println(child2.getName()+" thread started. With priority "+child2.getPriority());
		Address add = new Address();
		try {
			add.address("Mumbai,Maharashtra");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
	}
	
}
