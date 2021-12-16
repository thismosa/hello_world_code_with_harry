package com.company;

import java.util.Scanner;

public class exceptions {
    public static void main(String[] args) {
        try
        {
            int a = 688;
            int b = 0;
            int c = a/b;
            System.out.println("the result is "+ c);
        }
        catch (Exception e){
            System.out.println("we failed to divide ");
            System.out.println(e);
        }

        int [] hello = new int [10];
        hello[1] = 10;
        hello[2] = 9;
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("welcome to video no. 2");

            try {
                System.out.println(hello[100]);
            }
            catch (Exception e){
                System.out.println(e);
            }


        }
        catch (Exception e){
            System.out.println(e);
        }
// LETS LEAN ABOUT FINALTTY BLOG
       int a = 10;
       int b = 0;
        try {
           int c =  a/b;

        }catch (Exception e ){
            System.out.println(e);
        }finally {
            System.out.println("this is the end of the program");
        }

    }
}
