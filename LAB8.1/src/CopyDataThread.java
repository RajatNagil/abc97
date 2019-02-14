import java.io.*;
public class CopyDataThread implements Runnable{
public static void main(String...args){
	Thread th1 = new Thread();
	th1.start();
}
   @Override
   public void run() {
	   FileReader source=null;
	   FileWriter target=null;
	   try{
		   source = new FileReader("/D:/source.txt");
		   target = new FileWriter("/D:/Target.txt");
		   int allContent;
		   int readLength=0;
		   while((allContent=source.read())!=-1){
		      target.write(allContent);
		   	readLength++;
		   	if(readLength==10){
		   		System.out.println("10 character has been copied.");
		   		readLength=0;
		   	}
		   }  	
	   }
	   catch(IOException e){e.printStackTrace();}
	   finally{
		   	if(source!=null)
				try {
					source.close();
				} 
		   	catch (IOException e) {
					e.printStackTrace();
				}
		       if(target!=null)
				try {
					target.close();
				} 
		       catch (IOException e) {
					e.printStackTrace();
				}
	   }
   }
}



