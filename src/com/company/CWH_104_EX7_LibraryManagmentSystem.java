// *****BY CODEWITHHARRY**** 
// import java.util.ArrayList;
// class Book{
//     public String name,author;
//     Book(String name,String author){
//         this.name=name;
//         this.author=author;
//     }
//     @Override
//     public String toString() {
//         return "{"+"name='"+name+'\''+",author='"+author+'\''+'}';
//     }
// }
// class MyLibrary{
//     public ArrayList<Book> books;
//     MyLibrary(ArrayList<Book> books){
//         this.books=books;
//     }
//     public void addBook(Book book){
//        System.out.println("The Book Has been added to library"); 
//        this.books.add(book);
//     }
//     public void issueBook(Book book,String issued_to){
//        System.out.println("The Book Has been issued from library to "+issued_to); 
//        this.books.remove(book);
//     }
//     public void returnBook(Book book){
//        System.out.println("The Book Has Been Returned"); 
//        this.books.add(book);
//     }
// }
// public class CWH_104_EX7_LibraryManagmentSystem{
//    public static void main(String[] args) {  
//     ArrayList<Book> bk=new ArrayList<>();   
//     Book b1=new Book("Algorithms1","CLRS1");
//     bk.add(b1);
//     Book b2=new Book("Algorithms2","CLRS2");
//     bk.add(b2);
//     Book b3=new Book("Algorithms3","CLRS3");
//     bk.add(b3);
//     Book b4=new Book("Algorithms4","CLRS4");
//     bk.add(b4);

//     MyLibrary l=new MyLibrary(bk);
//     System.out.println(l.books);
//     l.issueBook(b1,"pratham");
//     l.issueBook(b4,"chhabra");
//     System.out.println(l.books);
//    }
// }