
public class ThreadFactorial {
	 public static void main(String[] args) {
		  RunnableResource resource = new RunnableResource();
			Thread th1 = new Thread(resource,"numberThread");
			Thread th2 = new Thread(resource,"factorialThread");
			
		try {
			th1.start();
			th2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			th2.start();
	
	 }
}
