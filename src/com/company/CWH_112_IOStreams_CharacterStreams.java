// import java.io.BufferedReader;
// import java.io.BufferedWriter;
// import java.io.FileReader;
// import java.io.FileWriter;
// import java.io.IOException;
// import java.io.PrintWriter;

// public class CWH_112_IOStreams_CharacterStreams {
//     public static void main(String[] args) {
//         // Example1)
//         // try{
//         //     FileReader inputStream=new FileReader("CWH_112_IOStreams/CWH_112_IOStreams_ByteStreams_read.txt");
//         //     FileWriter outputStream=new FileWriter("CWH_112_IOStreams/CWH_112_IOStreams_ByteStreams_write.txt");
//         //     int temp;
//         //     while((temp=inputStream.read())!=-1){
//         //         outputStream.write(temp);
//         //     }
//         //     inputStream.close();
//         //     outputStream.close();
//         // }
//         // catch(IOException e){
//         //     System.out.println("Error in reading or writting data");
//         // }

//         // Example2)
//         // try{
//         //     BufferedReader inputStream=new BufferedReader(new FileReader("CWH_112_IOStreams/CWH_112_IOStreams_ByteStreams_read.txt"));
//         //     PrintWriter outputStream=new PrintWriter(new FileWriter("CWH_112_IOStreams/CWH_112_IOStreams_ByteStreams_write.txt"));
//         //     String l;
//         //     while((l=inputStream.readLine())!=null){
//         //         System.out.println(l);
//         //         outputStream.println(l);
//         //     }
//         //     inputStream.close();
//         //     outputStream.close();
//         // }
//         // catch(IOException e){
//         //     System.out.println("Some Erorr in read write file");
//         // }
//     }
// }
