import java.math.*;
public class RunnableResource implements Runnable{	
	 int num = (int)(Math.random()*10+1);
	 @Override
	 public synchronized void run() { 
			Thread t = Thread.currentThread();
			if(t.getName().equals("numberThread")){
					try { notify();
						 System.out.println("Number:       "+num);
						 wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
			}		
			if(t.getName().equals("factorialThread")){    
				    try  { notify();
					  int j,fact=1;  
				      int number=num;   
					  for(j=1;j<=number;j++){    
					      fact=fact*j;    
					  }    
					  System.out.println("Factorial of "+number+" is: "+fact); 
					  wait();
					 }  
				    catch(InterruptedException e){
						 e.printStackTrace();}		
		}
}
}