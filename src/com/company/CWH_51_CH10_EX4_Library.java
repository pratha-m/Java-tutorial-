// class Library{
//     String availableBooks[]=new String[100];
//     String issueBooks[]=new String[100];
//     // int noOfAvaiBooks=0;
//     // int noOfIssueBooks=0;
//     static int availBooksIndex=0;
//     static int issueBooksIndex=0;

//     public void showAvailableBooks(){
//          if(availBooksIndex==0){
//           System.out.println("No Available Books....");
//          } 
//          else{
//             System.out.println("Available books are :");
//             for(int i=0;i<availBooksIndex;i++){
//                System.out.println(availableBooks[i]);
//             }
//          }
//          System.out.println();
//     }
//     public void showIssuedBooks(){
//          if(issueBooksIndex==0){
//             System.out.println("No Available Books....");
//          } 
//          else{
//             System.out.println("Available Issued books are :");
//             for(int i=0;i<issueBooksIndex;i++){
//                System.out.println(issueBooks[i]);
//             }
//          }
//          System.out.println();
//     }
//     public void addBook(String inputBook){
//        availableBooks[availBooksIndex]=inputBook;
//        availBooksIndex++; 
//     }
//     public void deletingAvailBook(int i,String inputBook){
//       for(int j=i;j<availBooksIndex;j++){
//          availableBooks[j]=availableBooks[j+1];
//       }             
//       issueBooks[issueBooksIndex]=inputBook;
//       issueBooksIndex++;
//       availBooksIndex--;
//     }
//     public void issueBook(String inputBook){
//        boolean isBookFound=false;    
//        for(int i=0;i<availBooksIndex;i++){
//           if(availableBooks[i]==inputBook){
//             deletingAvailBook(i,inputBook);
//             isBookFound=true;
//             System.out.println(inputBook+" Is Issued Successfully...");
//           }
//        } 
//        if(isBookFound==false){
//           System.out.println("Sorry the "+(inputBook)+" not avaialable Now....");
//        }
//     }
//     public void deletingIssueBook(int i,String inputBook){
//       for(int j=i;j<issueBooksIndex;j++){
//          issueBooks[j]=issueBooks[j+1];
//       }             
//       availableBooks[availBooksIndex]=inputBook;
//       availBooksIndex++;
//       issueBooksIndex--;
//     }
//     public void returnBook(String retBook){
//       boolean isBookFoundInIssue=false;    
//       for(int i=0;i<issueBooksIndex;i++){
//          if(issueBooks[i]==retBook){
//            deletingIssueBook(i,retBook);
//            isBookFoundInIssue=true;
//            System.out.println(retBook+" Is Returned Successfully...");
//          }
//       } 
//       if(isBookFoundInIssue==false){
//          System.out.println("Sorry the book "+(retBook)+" not issued yet....");
//       }
//     }
//    }
// public class CWH_51_CH10_EX4_Library {
//      public static void main(String[] args) {
//         Library l=new Library();
//         l.showAvailableBooks();
//         l.addBook("book1");
//         l.addBook("book2");
//         l.addBook("book3");
//         l.addBook("book4");
//         l.showAvailableBooks();
//         l.issueBook("book1");        
//         l.issueBook("book4");        
//         l.showAvailableBooks();
//         l.showIssuedBooks();
//         l.returnBook("book4");
//         l.showAvailableBooks();
//      }    
// }
