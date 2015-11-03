import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

//import java.io.FileInputStream;

//        Modify	the	FileDownload	program	so	it	can download	several	podcasts	from	americhka.us.
//        After downloading	as	separate	files	works,	see	if	you	can	get	them	as
//        one	zip	file.

class FileDownloadAsZip {

  public static void main(String args[]){

      String url1 = "https://americhka.files.wordpress.com/2015/10/gfranq_jusee_60209987_.jpg?w=1086&h=483";
      String url2 = "https://americhka.files.wordpress.com/2015/10/img_3915.jpg?w=1086&h=1446";
      final int BUFFER = 2048;
      byte data[] = new byte[BUFFER];

    // Create the ZIP file
      FileOutputStream fos  = null;
      ZipOutputStream zos = null;

      try {
           fos = new FileOutputStream("d:\\temp\\file.zip");
          zos = new ZipOutputStream(new BufferedOutputStream(fos));
      } catch (FileNotFoundException e) {
          e.printStackTrace();
      }


    InputStream is  = null;
    URLConnection urlConnection  = null;
      URL url = null;

  try{

      url = new URL(url1);
      urlConnection = url.openConnection();
        is = urlConnection.getInputStream();

  } catch (IOException ioe){
	  ioe.printStackTrace();
  }

      try {
          zos.putNextEntry(new ZipEntry("image1.jpg"));
          int count;
          while((count = is.read(data, 0, BUFFER)) != -1) {
              zos.write(data, 0, count);
          }
          zos.putNextEntry(new ZipEntry("image2.jpg"));

          url = new URL(url2);
          urlConnection = url.openConnection();
          is = urlConnection.getInputStream();

          while((count = is.read(data, 0, BUFFER)) != -1) {
              zos.write(data, 0, count);
          }

      } catch (IOException e) {
          e.printStackTrace();
      }

      try {
          zos.flush();
          zos.close();
          is.close();
      } catch (IOException e) {
          e.printStackTrace();
      }


  }
}
