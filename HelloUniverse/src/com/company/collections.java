package com.company;

import java.util.ArrayList;

public class collections {
    public static void main(String[] args) {
        ArrayList <Integer> li = new ArrayList<>();


        li.add(6);
        li.add(2);
        li.add(3);
        li.add(3);
        li.add(4);
        li.add(9);
        li.add(0,5);

        for (int i = 0; i < li.size();i++){
            System.out.println(li.get(i));
        }
        System.out.println(li.contains(12));//return true and false
        System.out.println(li.indexOf(12));






    }
}
