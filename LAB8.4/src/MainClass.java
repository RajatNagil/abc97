public class MainClass {
	public static void main(String[] args) {
		ElectronicShopInterCommunication resource = new ElectronicShopInterCommunication();
		Thread th1 = new Thread(resource,"customer");
		Thread th2 = new Thread(resource,"billingPerson");	
		try {
			th2.start();
			th1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		th1.start();
	}
}
