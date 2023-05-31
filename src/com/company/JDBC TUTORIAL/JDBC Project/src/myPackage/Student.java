package myPackage;

import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.DriverManager;

public class Student {
    public void createDatabase(){
        try{
            String url="jdbc:mysql://localhost:3306/";
            String userName="root";
            String password="abcd";
            Connection conn=DriverManager.getConnection(url,userName,password);
            System.out.println("Connection Succeded");

            Statement stm=conn.createStatement();
            String query="create database codingwallah";
            stm.execute(query);
            System.out.println("Database Created successfully");
            conn.close();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    public void createTable(){
        try{
            String url="jdbc:mysql://localhost:3306/";
            String db="codingwallah";
            String userName="root";
            String password="abcd";
            Connection conn=DriverManager.getConnection(url+db,userName,password);
           
            Statement stm=conn.createStatement();
            String query="create table student (sid int(3),sname varchar(200),semail varchar(200))";
            stm.execute(query);
            System.out.println("Table Created successfully");
            conn.close();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    public void createData(){
        try{
            String url="jdbc:mysql://localhost:3306/";
            String db="codingwallah";
            String userName="root";
            String password="abcd";
            Connection conn=DriverManager.getConnection(url+db,userName,password);

            String query="insert into student (sid,sname,semail) values (?,?,?)";
            PreparedStatement pstm=conn.prepareStatement(query);
            pstm.setInt(1,10); // set value for first ?
            pstm.setString(2,"pratham"); // set value for second ?
            pstm.setString(3,"pratham@gmail.com"); // set value for third ?
            pstm.executeUpdate();
            System.out.println("data inserted successfully");
            conn.close();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    public void readData(){
        try{
            String url="jdbc:mysql://localhost:3306/";
            String db="codingwallah";
            String userName="root";
            String password="abcd";
            Connection conn=DriverManager.getConnection(url+db,userName,password);

            Statement stm=conn.createStatement();
            String query="select * from student";
            ResultSet rs=stm.executeQuery(query);
            while(rs.next()){
               System.out.println("id:"+rs.getInt(1)+",name:"+rs.getString(2)+",email:"+rs.getString(3));   
            }
            System.out.println("Read Data successfully");
            conn.close();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    public void updateData(){
        try{
            String url="jdbc:mysql://localhost:3306/";
            String db="codingwallah";
            String userName="root";
            String password="abcd";
            Connection conn=DriverManager.getConnection(url+db,userName,password);

            String query="update student set sid=? where sname=?";
            PreparedStatement pstm=conn.prepareStatement(query);
            pstm.setInt(1,20);
            pstm.setString(2,"pratham");
            pstm.execute();
            System.out.println("Updated Data successfully");
            conn.close();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    public void deleteData(){
        try{
            String url="jdbc:mysql://localhost:3306/";
            String db="codingwallah";
            String userName="root";
            String password="abcd";
            Connection conn=DriverManager.getConnection(url+db,userName,password);

            String query="delete from student where sid=?";
            PreparedStatement pstm=conn.prepareStatement(query);
            pstm.setInt(1,20);
            pstm.execute();
            System.out.println("Data Deleted successfully");
            conn.close();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
