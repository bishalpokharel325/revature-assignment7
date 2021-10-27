package com.company;

import java.util.Scanner;
class Rectangle{
    double length,width;
    public Rectangle(double length,double width){
        this.length=length;
        this.width=width;
    }
    public int getArea(){
        return (int)Math.round(length*width);
    }
}
public class RectangeArea {
    public static void main(String[] args) {
        Scanner length_object=new Scanner(System.in);
        Scanner width_object=new Scanner(System.in);
        System.out.println("Enter Length of Rectangle:");
        double length=length_object.nextDouble();
        System.out.println("Enter Width of Rectangle:");
        double width=width_object.nextDouble();
        Rectangle r1=new Rectangle(length,width);
        System.out.println(r1.getArea());
    }
}
