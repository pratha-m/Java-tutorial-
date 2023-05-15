// class Circle{
//     Double r;
//     Circle(){
//         System.out.println("Circle constructor without parameters");
//     }
//     Circle(Double rad){
//         System.out.println("Circle constructor with parameter");
//         this.r=rad;
//     }
//     public Double areaCircle(){
//         return 3.14*r*r;
//     }
// }
// class Cylinder extends Circle{
//     Double h;
//     Cylinder(Double radius,Double height){
//         super(radius);
//         this.h=height;
//     }
//     public Double surfAreaCylinder(){
//         return 2*3.14*r*h+2*3.14*r*r;
//     }
//     public Double volumeCyl(){
//         return 3.14*r*r*h;
//     }
// } 


// class Rectangle{
//     Double l;
//     Double w;
//     Rectangle(Double length,Double width){
//          this.l=length;
//          this.w=width;
//     }
//     public Double areaRect(){
//         return l*w;
//     }
//     public Double getLength(){
//         return l;
//     }   
//     public void setLength(Double length){
//         this.l=length;
//     }
//     public Double getWidth(){
//         return w;
//     }   
//     public void setWidth(Double width){
//         this.w=width;
//     }
// }
// class Cuboid extends Rectangle{
//     Double he;
//     Cuboid(Double length,Double width,Double height){
//         super(length,width);
//         this.he=height; 
//     }
//     public Double areaCuboid(){
//         return 2*l*w+2*l*he+2*he*w;
//     }
//     public Double volumeCuboid(){
//         return l*w*he;
//     }
//     public Double getHeightCuboid(){
//         return he;
//     }
//     public void setHeightCuboid(Double height){
//         this.he=height;
//     }
// }

// class Basee1{
//     Basee1(){
//         System.out.println("This is the class Base1");
//     }
//     Basee1(int a){
//         System.out.println("This is second constructor of Base1 class with val="+a);
//     }
// }
// class Derivedd1 extends Basee1{
//     Derivedd1(){
//         System.out.println("This is the class Derivedd1");
//     }
//     Derivedd1(int a){
//         System.out.println("This is second constructor of Derivedd1 class with val="+a);
//     }
// }
// class Derivedd2 extends Derivedd1{
//     Derivedd2(){
//         System.out.println("This is the class Derivedd2");
//     }
//     Derivedd2(int a){
//         System.out.println("This is second constructor of Derivedd2 class with val="+a);
//     }
// }
// public class CWH_52_CH10_PS {
//       public static void main(String[] args){
//         // 1) 3)
//         // Cylinder cl=new Cylinder(2.4,5.5);
//         // System.out.println(cl.surfAreaCylinder());
//         // System.out.println(cl.volumeCyl());

//         // 2) 4)
//         //  Cuboid cb=new Cuboid(2.34,6.78,9.44);
//         //  System.out.println(cb.areaCuboid()); 
//         //  System.out.println(cb.volumeCuboid());

//         //  5)
//         // Derivedd2 d2=new Derivedd2();
//         // Derivedd2 d3=new Derivedd2(12);
//         // Derivedd1 d1=new Derivedd1();
//       }
// }
