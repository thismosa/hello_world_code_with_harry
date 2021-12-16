package com.company;

import java.util.ArrayList;

class A{
    public void show() {
        System.out.println("this is in show");
    }
}

public class Anynomous {

    public static void main(String[] args) {
        A obj = new A(){

            public void show(){
                System.out.println("i am the best");
            }

        };
        obj.show();


        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(5);
        numbers.add(9);
        numbers.add(8);
        numbers.add(1);
        numbers.forEach( (n) -> { System.out.println(n); } );
    }


    }

