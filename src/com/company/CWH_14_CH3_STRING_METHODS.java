// //package com.company;

// // import java.util.Scanner;

// import java.util.StringTokenizer;

// public class CWH_14_CH3_STRING_METHODS {
//     public static void main(String[] args) {
     
//     // *******BASIC STRINGS********      
//     // String name="Pratham";
//     // String name2="   pratham  ";
//     // String name3="pratham is my name and is name";
//     // System.out.println(name);

//     // String Methods

//     // length() method
//     // int len=name.length();
//     // System.out.println("Length :"+len);

//     // toLowerCase() method
//     // String lStr=name.toLowerCase();
//     // System.out.println("Lower case Str :"+lStr);

//     // toUpperCase() method 
//     // String uStr=name.toUpperCase();
//     // System.out.println("Upper Case Str :"+uStr);

//     // trim() method 
//     // System.out.println(name2);
//     // String trimStr=name2.trim();
//     // System.out.println(trimStr);

//     // substring() method 
//     // String subStr1=name.substring(3); // substring start from 3 index to end
//     // System.out.println("Substaring1 :"+subStr1);
//     // String subStr2=name.substring(1,5); // substring start from 1 index to 4th index
//     // System.out.println("Substring2 :"+subStr2);
//     // String subStr3=name.substring(3,7);
//     // System.out.println("Substring2 :"+subStr3);

//     // replace() method 
//     // String repStr1=name.replace("a","b");
//     // System.out.println(repStr1);
//     // String repStr2=name.replace("Pra","abc");
//     // String repStr3=name.replace("a","mno");
//     // System.out.println(repStr3);

//     // startsWith() method 
//     // boolean startsStr1=name.startsWith("pr");
//     // System.out.println(startsStr1);
//     // boolean startsStr2=name.startsWith("Pr");
//     // System.out.println(startsStr2);
//     // boolean startsStr3=name.startsWith("th");
//     // System.out.println(startsStr3);

//     // endswith() method  
//     // boolean endsStr1=name.endsWith("ham");
//     // System.out.println(endsStr1);
//     // boolean endsStr2=name.endsWith("Ham");
//     // System.out.println(endsStr2);
//     // boolean endsStr3=name.endsWith("Pra");
//     // System.out.println(endsStr3);

//     // charAt() method 
//     // char charAtStr1=name.charAt(1);
//     // System.out.println(charAtStr1);
//     // char charAtStr2=name.charAt(4);
//     // System.out.println(charAtStr2);
//     // char charAtStr3=name.charAt(7);  // it gives no character at index 7
//     // System.out.println(charAtStr3);

//     // indexOf() method  
//     // int indexStr1=name.indexOf("a");
//     // System.out.println(indexStr1);
//     // int indexStr2=name.indexOf("th");
//     // System.out.println(indexStr2);
//     // int indexStr3=name.indexOf("a",3);
//     // System.out.println(indexStr3);
//     // int indexStr4=name3.indexOf("na",15);
//     // System.out.println(indexStr4);

//     // lastIndexOf() method 
//     // int strIndex1=name.lastIndexOf("a");
//     // System.out.println(strIndex1);
//     // int strIndex2=name.lastIndexOf("a",4);
//     // System.out.println(strIndex2);
//     // int strIndex3=name3.lastIndexOf("nam");
//     // System.out.println(strIndex3);
//     // int strIndex4=name3.lastIndexOf("nam",24);
//     // System.out.println(strIndex4);
//     // int strIndex5=name3.lastIndexOf("namanja",24);
//     // System.out.println(strIndex5);

//     // equals() method 
//     // boolean isEqual1=name.equals("pratham");
//     // System.out.println(isEqual1);
//     // boolean isEqual2=name.equals("Pratham");
//     // System.out.println(isEqual2);
//     // boolean isEqual3=name3.equals("hello hi");
//     // System.out.println(isEqual3);

//     // boolean isEqualCase1=name.equalsIgnoreCase("praTHAM");
//     // System.out.println(isEqualCase1);
//     // boolean isEqualCase2=name.equalsIgnoreCase("prathamchh");
//     // System.out.println(isEqualCase2);

//     // System.out.println("This is escape \" sequence");
//     // System.out.println("This is escape \' sequence");
//     // System.out.println("This is escape \\sequence");
//     // System.out.println("This is escape \tsequence");
//     // System.out.println("This is escape \nsequence");

//     // Concatenation in string 
//     // String str1="hello";
//     // String str2="world";
//     // String str=str1+" "+str2;
//     // System.out.println(str);

//     // compare strings compareTo() method 
//     // str1>str2 --> comapreTo()-->+ve 
//     // str1==str2 --> comapreTo()-->0 
//     // str1<str2 --> comapreTo()-->-ve 
//     // Scanner sc=new Scanner(System.in);
//     // String name1,name2;
//     // System.out.println("Enter Name1:");
//     // name1=sc.nextLine();
//     // System.out.println("Enter Name2:");
//     // name2=sc.nextLine();
//     // if(name1.compareTo(name2)==0){
//     //      System.out.println("Strings are equal");
//     // }
//     // else if(name1.compareTo(name2)>0){
//     //     System.out.println("name1 is greater than name2");
//     // }
//     // else if(name1.compareTo(name2)<0){
//     //     System.out.println("name1 is less than name2");
//     // }    

//     // split() method 
//     // String str="hello my name is pratham";
//     // String words[]=str.split(" ");
//     // for(int i=0;i<words.length;i++){
//     //     System.out.println(words[i]);
//     // }

//     // ******STRING BUILDER****** 
//     // one by one method call (asynchronized)
//     // String builder is asynchronized so thread is not safe (means two threads can 
//     // call the stringBuilder methods simultaniously)

//     // StringBuilder sb=new StringBuilder("Tony");
//     // System.out.println(sb);

//     // Character at index 
//     // System.out.println(sb.charAt(0)); 

//     // set character at index  
//     // sb.setCharAt(0,'p'); 
//     // System.out.println(sb);

//     // insert character at index 
//     // Eg1)
//     // sb.insert(0,'S');
//     // System.out.println(sb);
//     // Eg2)
//     // sb.insert(2,'n');
//     // System.out.println(sb);

//     // delete substring  
//     // Eg1)
//     // sb.delete(2, 3);
//     // System.out.println(sb); 
//     // Eg2)
//     // sb.delete(1, 3);
//     // System.out.println(sb);

//     // append method
//     // Eg1)
//     // sb.append(" ");
//     // sb.append("s");
//     // sb.append("t");
//     // sb.append("a");
//     // sb.append("r");
//     // sb.append("k");
//     // System.out.println(sb);
//     // Eg2)
//     // sb.append(" Stark");
//     // System.out.println(sb);

//     // reverse
//     // sb.reverse();
//     // System.out.println(sb);

//     // reverse a string 
//     // StringBuilder str=new StringBuilder("hello");
//     // for(int i=0;i<str.length()/2;i++){
//     //     int front=i;
//     //     int back=str.length()-1-i;
//     //     char frontChar=str.charAt(front);
//     //     char backChar=str.charAt(back);
//     //     str.setCharAt(front,backChar);
//     //     str.setCharAt(back,frontChar);
//     // } 
//     // System.out.println(str);

//     // ******STRING BUFFER****
//     // multiple methods calls simultaniously(synchronous)
//     // String buffer is synchronized so thread safe (means two threads cant 
//     // call the stringBuffer methods simultaniously)

//     // ->used to create mutable string objects
//     // StringBuffer sb1=new StringBuffer();
//     // System.out.println("Capacity Before Apeend :"+sb1.capacity());
//     // System.out.println("length Before Apeend :"+sb1.length());
//     // sb1.append("12345678910qw990838");
//     // System.out.println("Capacity after Apeend :"+sb1.capacity());
//     // System.out.println("length after Apeend :"+sb1.length());
//     // System.out.println("String is :"+sb1);

//     // StringBuffer sb2=new StringBuffer(12);
//     // System.out.println(sb2.capacity());
//     // System.out.println(sb2.length());
     
//     // StringBuffer sb3=new StringBuffer("Hello World");
//     // System.out.println(sb3);

//     // char ch[]={'a','b','c','d'};
//     // StringBuffer sb4=new StringBuffer(CharSequence ch);

//     // StringBuffer sbf=new StringBuffer("hello");
//     // System.out.println(sbf);

//     // Methods In string Buffer 
//     // 1)append
//     // sbf.append("world");
//     // sbf.append(new String("New World obj"));
//     // sbf.append(28484);
//     // System.out.println(sbf);
//     // 2)insert
//     // sbf.insert(2,"new");
//     // sbf.insert(3,new String("gamer"));
//     // sbf.insert(1,12334);
//     // System.out.println(sbf);
//     // 3)reverse
//     // sbf.reverse();
//     // System.out.println(sbf);
//     // 4)replace 
//     // sbf.replace(2, 3, "world");
//     // sbf.replace(2, 3,new String("gamer"));
//     // System.out.println(sbf);
//     // 5)capacity
//     // Empty contructor string Buffer reserves space for 16 characters so its capcity is 16 
//     // System.out.println(sbf.capacity());
//     // StringBuffer sbf2=new StringBuffer();
//     // System.out.println(sbf2.capacity());  
//     // 6)Ensure capacity
//     // -->If the argument of the ensureCapacity() method is less than the existing
//     // capacity, then there will be no change in existing capacity.
//     // -->If the argument of the ensureCapacity() method is greater than the existing
//     // capacity, then there will be change in the current capacity using following rule:
//     // newCapacity = (oldCapacity*2) + 2.
//     // StringBuffer sbf3=new StringBuffer();
//     // System.out.println(sbf3.capacity());
//     // sbf3.ensureCapacity(30);
//     // System.out.println(sbf3.capacity());

//     // *********STRING TOKENIZER************ 
//     // -->used to break a string into the tokens based on provided delimeter
//     // -->the set of characters considered to be delimiters

//     // Syntax1)StringTokenizer(string,delim,returnDelim)
//     // Eg1)
//     // StringTokenizer st1=new StringTokenizer("hello:my:name:is:pratham", ":", false);
//     // System.out.println(st1.nextToken()); 
//     // System.out.println(st1.nextToken()); 
//     // System.out.println(st1.nextToken()); 
//     // Eg2)
//     // StringTokenizer st1=new StringTokenizer("hello:my:name:is:pratham", ":", true);
//     // System.out.println(st1.nextToken()); 
//     // System.out.println(st1.nextToken()); 
//     // System.out.println(st1.nextToken()); 
//     // System.out.println(st1.nextToken()); 
//     // System.out.println(st1.nextToken()); 
//     // System.out.println(st1.nextToken()); 
//     // System.out.println(st1.nextToken()); 
//     // System.out.println(st1.nextToken()); 
//     // System.out.println(st1.nextToken()); 
//     // Syntax2)StringTokenizer(string,delim)
//     // StringTokenizer st1=new StringTokenizer("hello:my:name:is:pratham", ":");
//     // System.out.println(st1.nextToken()); 
//     // System.out.println(st1.nextToken()); 
//     // System.out.println(st1.nextToken()); 
//     // System.out.println(st1.nextToken()); 
//     // System.out.println(st1.nextToken()); 

//     // hasMoreTokens() returns true when there is atleast one character in string . if there is no character in 
//     // string it returns false  
//     // StringTokenizer st1=new StringTokenizer("h");
//     // System.out.println(st1.hasMoreTokens());
//     // StringTokenizer st2=new StringTokenizer("");
//     // System.out.println(st2.hasMoreTokens());

//     // nextToken() // returns string
//     // Eg1)
//     // StringTokenizer st1=new StringTokenizer("hello hi by");
//     // System.out.println(st1.nextToken());
//     // System.out.println(st1.nextToken());
//     // System.out.println(st1.nextToken());
//     // Eg1)
//     // StringTokenizer st1=new StringTokenizer("hello hi by");
//     // System.out.println(st1.nextToken("h"));
//     // System.out.println(st1.nextToken("h"));

//     // hasMoreElements() // same as hasMoreTokens() exists so this class can implement Enumeration
//     // StringTokenizer st1=new StringTokenizer("hello hi by");
//     // System.out.println(st1.hasMoreElements());
//     // StringTokenizer st2=new StringTokenizer("");
//     // System.out.println(st2.hasMoreElements());

//     // nextElement() // same as nextToken() but it returns object so that this class can implement Enumeration 
//     // StringTokenizer st1=new StringTokenizer("hello hi by");
//     // System.out.println(st1.nextElement());
//     // System.out.println(st1.nextElement());
//     // System.out.println(st1.nextElement());

//     // countTokens()
//     // StringTokenizer st1=new StringTokenizer("hello hi by");
//     // System.out.println(st1.countTokens());
//     }
// }
