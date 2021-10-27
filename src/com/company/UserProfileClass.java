package com.company;

import java.util.Scanner;

class User{
    String name,field_of_interest;
    int roll_no;
    public User(String name, int roll_no,String field_of_interest){
        this.name=name;
        this.field_of_interest=field_of_interest;
        this.roll_no=roll_no;
    }
    public void printProfile(){
//        Hey, my name is xyz and my roll number is xyz.
        System.out.println("Hey, my name is "+name+" and my roll number is "+roll_no+". My field of interest are "+field_of_interest);
    }

}
public class UserProfileClass {
    public static void main(String[] args) {
        Scanner scan_name=new Scanner(System.in);
        Scanner scan_roll=new Scanner(System.in);
        Scanner scan_interest=new Scanner(System.in);
        System.out.println("Enter Name:");
        String name=scan_name.nextLine();

        System.out.println("Enter interest:");
        String interest=scan_interest.nextLine();
        System.out.println("Enter roll no:");
        int roll=scan_roll.nextInt();

        User u1=new User(name,roll,interest);
        u1.printProfile();
    }
}
