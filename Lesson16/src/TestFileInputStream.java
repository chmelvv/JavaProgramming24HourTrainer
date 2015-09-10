import java.io.*;
public class TestFileInputStream {

	public static void main(String[] args) {
		
		  try (FileInputStream myFile = new  FileInputStream("abc.dat")){
			  
		            boolean eof = false;
		            while (!eof) {
		                int byteValue = myFile.read();
		                System.out.print(byteValue + " ");
		                if (byteValue  == -1)
		                    eof = true;
		            }
		    
		  } catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
}
