import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CWH_112_IOStreams_ByteStreams {
    public static void main(String[] args) {
        try{
            FileInputStream inputStream=new FileInputStream("CWH_112_IOStreams/CWH_112_IOStreams_ByteStreams_read.txt");
            FileOutputStream outputStream=new FileOutputStream("CWH_112_IOStreams/CWH_112_IOStreams_ByteStreams_write.txt"); 
            int temp;
            while((temp=inputStream.read())!=-1){
                 outputStream.write(temp); 
            }
            inputStream.close();
            outputStream.close();
        }
        catch(IOException e){
            System.out.println("Exception Occured");
        }
    }
}

