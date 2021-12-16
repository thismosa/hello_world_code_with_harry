package com.company;

 class Employs{ // external class one file can just have one public function
     int id;
     String name;
     void printNameDetails(){
         System.out.println("my id is " + id );
         System.out.println("and my name is " + name );

         }
         public String getName(){
         return  name;
         }
     }


public class oop {
    // abastarct hinding interal deatals
    // encumpustion getting parts together
    //inhertence lets inherit other classes
    // polymorisms one entity many froms like phone is camera as well as music player

    public static void main(String[] args) {
        // declearning a intence of a class
        Employs harry = new Employs();

        // setting the parremeter there is also other way getter and setter if attributes are privite
        harry.id = 12;
        harry.name = "harry";
    }




}
