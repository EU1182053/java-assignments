package assignment198;

public class Address {
	public static String data = "";
	
	public Address() {
		// TODO Auto-generated constructor stub
	}
	public void address(String data) throws InterruptedException {
		Thread current = Thread.currentThread();
		Address.data += data + "\t";
		System.out.println(Address.data+"\n");
		Thread.sleep(2000);
	}

}
