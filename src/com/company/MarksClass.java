package com.company;

import java.util.Scanner;

abstract class Mark{
    abstract float getPercentage();
}
class AverageObject extends Mark {
    public float a, b, c, d;
    public int id;

    public AverageObject(float a, float b, float c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.id = 1;
    }

    public AverageObject(float a, float b, float c, float d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.id = 2;
    }

    public float getPercentage(){
        return switch (id) {
            case 1 -> (a + b + c) / 3;
            case 2 -> (a + b + c + d) / 3;
            default -> 0;
        };
    }
}
public class MarksClass {
    public static void main(String[] args) {
        System.out.println("Enter no of subjects:");
        Scanner sc=new Scanner(System.in);
        int no=sc.nextInt();
        if(no==3){
            System.out.println("Enter mark in first subject:");
            Scanner sc1=new Scanner(System.in);
            float mark1=sc1.nextFloat();
            System.out.println("Enter mark in second subject:");
            Scanner sc2=new Scanner(System.in);
            float mark2=sc2.nextFloat();
            System.out.println("Enter mark in third subject:");
            Scanner sc3=new Scanner(System.in);
            float mark3=sc3.nextFloat();
            AverageObject a1=new AverageObject(mark1,mark2,mark3);
            System.out.println("Percentage is:"+a1.getPercentage());
        }
        else if(no==4){
            System.out.println("Enter mark in first subject:");
            Scanner sc1=new Scanner(System.in);
            float mark1=sc1.nextFloat();
            System.out.println("Enter mark in second subject:");
            Scanner sc2=new Scanner(System.in);
            float mark2=sc2.nextFloat();
            System.out.println("Enter mark in third subject:");
            Scanner sc3=new Scanner(System.in);
            float mark3=sc3.nextFloat();
            System.out.println("Enter mark in fourth subject:");
            Scanner sc4=new Scanner(System.in);
            float mark4=sc4.nextFloat();
            AverageObject a1=new AverageObject(mark1,mark2,mark3,mark4);
            System.out.println("Percentage is:"+a1.getPercentage());
        }
    }
}
