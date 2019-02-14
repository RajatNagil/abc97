public class ThreadTimerDemo implements Runnable {
	public static void main(String[] args) {
		ThreadTimerDemo timer = new ThreadTimerDemo();
		Thread th1 = new Thread(timer);
		th1.start();	
	}
	@Override
	public void run() {
		for(int i=1;i<=10;i++){
			try {
				Thread.sleep(10000);
			} 
			catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Timer: "+i);
		}	
	}
}
