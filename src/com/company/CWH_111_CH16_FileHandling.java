// import java.io.File;
// import java.io.FileNotFoundException;
// import java.io.FileWriter;
// import java.io.IOException;
// import java.util.Scanner;

// import javax.xml.transform.Source;
// public class CWH_111_CH16_FileHandling {
//     public static void main(String[] args) {

//         // Code To create a new file 
//         // File myFile=new File("cwh_111_CH16_fileHandling.txt");
//         // try{
//         //     myFile.createNewFile();
//         // }
//         // catch(IOException e){
//         //     System.out.println("Unable to create file");
//         //     e.printStackTrace();
//         // }

//         // code to write to a file 
//         // try{
//         //     FileWriter fileWriter=new FileWriter("cwh_111_CH16_fileHandling.txt");  
//         //     fileWriter.write("Hello this is the the first file\nOkay Now Bye");
//         //     fileWriter.close();
//         // }
//         // catch(IOException e){
//         //     System.out.println("cannot writen to file");
//         //     e.printStackTrace();
//         // }

//         // Reading a file 
//         // File myFile=new File("cwh_111_CH16_fileHandling.txt");
//         // try{
//         //     Scanner sc=new Scanner(myFile);
//         //     while(sc.hasNextLine()){
//         //         String line=sc.nextLine();
//         //         System.out.println(line);
//         //     }
//         //     sc.close();
//         // }
//         // catch(FileNotFoundException e){
//         //     e.printStackTrace();
//         // }

//         // Deleting a file 
//         File myFile=new File("cwh_111_CH16_fileHandling.txt");
//         if(myFile.delete()){
//             System.out.println("I have Deleted the file "+myFile.getName());
//         }
//         else{
//             System.out.println("Some Error Occured While Deleting the file");
//         }
//     }
// }
