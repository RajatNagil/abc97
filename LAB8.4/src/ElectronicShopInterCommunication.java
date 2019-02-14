public class ElectronicShopInterCommunication implements Runnable{
	@Override
	public synchronized void run(){
		Thread t = Thread.currentThread();
		if(t.getName().equals("customer")){
			try { 
				System.out.println("Customer giving products to billing person");
				notify();
				wait();
			} 
			catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		if(t.getName().equals("billingPerson")){
			try { notify();
			wait();
			System.out.println("Billing person bills the product");
			} 
			catch (InterruptedException e) {
				e.printStackTrace();
			}
		}		
	}	
}
