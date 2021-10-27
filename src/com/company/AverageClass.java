package com.company;

import java.util.Scanner;

class Average{
    public float x,y,z;
    public Average(float x,float y,float z){
        this.x=x;
        this.y=y;
        this.z=z;
    }
    public void displayAverage(){
        System.out.println("The average is:"+(x+y+z)/3);
    }
}
public class AverageClass {
    public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        Scanner sc2=new Scanner(System.in);
        Scanner sc3=new Scanner(System.in);

        System.out.println("Enter first number:");
        float x=sc1.nextFloat();
        System.out.println("Enter second number:");
        float y=sc2.nextFloat();
        System.out.println("Enter third number:");
        float z=sc3.nextFloat();
        Average av=new Average(x,y,z);
        av.displayAverage();

    }
}
