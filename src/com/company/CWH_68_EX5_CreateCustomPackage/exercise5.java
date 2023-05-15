// package com.codewithharry.shape;

// class Rectangle{
//     int length;
//     int width;
//     int height;
//     Rectangle(int l,int w,int h){
//        this.length=l;
//        this.width=w;
//        this.height=h;
//     }
//     public int areaRect(){
//         return length*width;
//     }
//     public int volumeRect(){
//         return length*width*height;
//     }
// }
// class Square{
//     int side;
//     Square(int s){
//         this.side=s;
//     }
//     public int areaSq(){
//         return side*side;
//     }
//     public int volumeSq(){
//         return side*side*side;
//     }
// }
// class Circle{
//     int radius;
//     public void setCircRadius(int r){
//           this.radius=r;
//     }
//     public double areaCirc(){
//         return 3.14*radius*radius;
//     }
// }
// class Cylinder extends Circle{
//     int height;
//     public void setCylHeight(int h){
//         this.height=h;
//     }
//     public double areaCyl(){
//         return 2*3.14*radius*height+2*3.14*radius*radius;
//     }
//     public double volumeCyl(){
//         return 3.14*radius*height;
//     }
// }
// class Sphere extends Circle{
//     public double areaSpher(){
//        return 4*3.14*radius*radius;   
//     }
//     public double volumeSpher(){
//         return ((double)4/3)*3.14*radius*radius*radius;
//     }
// }
// public class exercise5{
//    public static void main(String[] args) {
//     //   Rectangle rect=new Rectangle(2,3,4);
//     //   System.out.println(rect.areaRect());
//     //   System.out.println(rect.volumeRect());
//     //   Square sq=new Square(3);
//     //   System.out.println(sq.areaSq());
//     //   System.out.println(sq.volumeSq());
      
//     //   Circle ci=new Circle();
//     //   ci.setCircRadius(3);
//     //   System.out.println(ci.areaCirc());

//     //   Cylinder cyl=new Cylinder();
//     //   cyl.setCircRadius(8);
//     //   cyl.setCylHeight(5);
//     //   System.out.println(cyl.areaCyl());
//     //   System.out.println(cyl.volumeCyl());

//     //    Sphere sp=new Sphere();
//     //    sp.setCircRadius(3);
//     //    System.out.println(sp.areaSpher());
//     //    System.out.println(sp.volumeSpher());
//    }
// }