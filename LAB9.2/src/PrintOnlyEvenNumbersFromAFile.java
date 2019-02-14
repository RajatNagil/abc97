import java.io.FileInputStream;
import java.io.IOException;
public class PrintOnlyEvenNumbersFromAFile {
	public static void main(String[] args) {
		int data;
		int value;
		String s = "";
		try(FileInputStream fin = new FileInputStream("D:\\myfile.txt")){
			while((data=fin.read())!= -1) {
				if((char)data!=',')
					s += Character.toString((char) data);
				else if((char)data==',' || (char)data == '.') {
					value = Integer.parseInt(s);
					if(value%2 == 0)
						System.out.println(value);
					s = "";
				}
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
