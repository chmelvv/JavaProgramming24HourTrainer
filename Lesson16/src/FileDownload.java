import java.io.FileOutputStream;
import java.io.IOException;
//import java.io.FileInputStream;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

//        Modify	the	FileDownload	program	so	it	can download	several	podcasts	from	americhka.us.
//        After downloading	as	separate	files	works,	see	if	you	can	get	them	as
//        one	zip	file.

class FileDownload{

  public static void main(String args[]){
    if (args.length!=4){
      System.out.println(
        "Proper Usage: java FileDownload SourceFile1URL SourceFile2URL LocalFile1 LocalFile2");
      System.out.println(
    	"For example:java FileDownload http://myflex.org/yf/podru/budam469.mp3 http://myflex.org/yf/podru/budam468.mp3 d:\\temp\\file1.mp3 d:\\temp\\file2.mp3");
      System.exit(-1);
    }

    URLConnection fileStream1=null;
    URLConnection fileStream2=null;
  try{
	    URL remoteFile1=new URL(args[0]);
        URL remoteFile2=new URL(args[1]);

        fileStream1=remoteFile1.openConnection();
        fileStream2=remoteFile2.openConnection();
  } catch (IOException ioe){
	  ioe.printStackTrace();
  }

  try(  FileOutputStream fOut1=new FileOutputStream(args[2]);
		InputStream in1 = fileStream1.getInputStream();){

    // Read a remote file and save it in the local one
    int data;
    System.out.println("Starting the download from " + args[0]);
    while((data=in1.read())!=-1){
         fOut1.write(data);
    }
    System.out.println("Finished downloading the file " + args[2]);
  } catch (Exception e){
     e.printStackTrace();
  }

    try(  FileOutputStream fOut2=new FileOutputStream(args[3]);
          InputStream in2 = fileStream2.getInputStream();){

      // Read a remote file and save it in the local one
      int data2;
      System.out.println("Starting the download from " + args[1]);
      while((data2=in2.read())!=-1){
        fOut2.write(data2);
      }
      System.out.println("Finished downloading the file " + args[3]);
    } catch (Exception e){
      e.printStackTrace();
    }
  }
}
