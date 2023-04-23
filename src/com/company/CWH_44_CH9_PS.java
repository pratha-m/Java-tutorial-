// package com.company;
import java.lang.Math;
class Cylinder{
    private float r;
    private float h;
    public void setRadius(float newRadius){
         this.r=newRadius;
    } 
    public void setHeight(float newHeight){
         this.h=newHeight;
    }
    public float getRadius(){
         return r;
    }
    public float getHeight(){
        return h;
    }
    public float cylSurfArea(){
        return (float)(2*Math.PI*r*h+2*Math.PI*r*r);
    }
    public float cylVolume(){
        return (float)(Math.PI*r*r*h);
    }
}
class Cylinder2{
    private float r2;
    private float h2;
    Cylinder2(float givenRadius,float givenHeight){
         this.r2=givenRadius;
         this.h2=givenHeight;
    } 
    public float getRadius2(){
        return r2;
    }
    public float getHeight2(){
        return h2;
    }
    public float cylSurfArea2(){
        return (float)(2*Math.PI*r2*h2+2*Math.PI*r2*r2);
    }
    public float cylVolume2(){
        return (float)(Math.PI*r2*r2*h2);
    }
}
class Rectangle2{
    private float length;
    private float breadth;
    Rectangle2(float givenLength,float givenBreadth){
       this.length=givenLength;
       this.breadth=givenBreadth;
    }
    public float getHeight(){
        return length;
    }
    public float getBreadth(){
        return breadth;
    }
}
class Sphere2{
    private float radSph;
    Sphere2(float givenRadius){
        this.radSph=givenRadius;
    }
    public float getRadiusSphere(){
        return radSph;
    }
    public float sphereVolume(){
        return (float)(4f/3f*Math.PI*radSph*radSph*radSph);
    }
    public float sphereSurfArea(){
        return (float)(4*Math.PI*radSph*radSph);
    }
}
public class CWH_44_CH9_PS {
    public static void main(String[] args) {
        // 1) 2)
        // Cylinder c1=new Cylinder();
        // c1.setRadius(3);
        // c1.setHeight(7);
        // System.out.println(c1.getRadius());
        // System.out.println(c1.getHeight());
        // System.out.println(c1.cylSurfArea());
        // System.out.println(c1.cylVolume());

        // 3)
        // Cylinder2 c2=new Cylinder2(5,7);
        // System.out.println(c2.getHeight2());
        // System.out.println(c2.getRadius2());
        // System.out.println(c2.cylSurfArea2());
        // System.out.println(c2.cylVolume2());

        // 4)
        // Rectangle2 r1=new Rectangle2(5f, 7f); 
        // System.out.println(r1.getHeight());
        // System.out.println(r1.getBreadth());

        // 5)
        // Sphere2 s1=new Sphere2(12f);
        // System.out.println(s1.getRadiusSphere());
        // System.out.println(s1.sphereVolume());
        // System.out.println(s1.sphereSurfArea());
    }
}
