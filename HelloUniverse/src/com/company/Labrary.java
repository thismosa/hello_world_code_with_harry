package com.company;

import java.util.Scanner;

class onlineLab{
    //you have to implement the class using java class labrary
    //methord add book issue books, returnbooks ,show available books
    // property array to store availble books
    // array to store issued books
    Scanner sc = new Scanner(System.in);
    String [] books;

    int noOfBooks = 0;
    public onlineLab(){
       books = new String [100];

    }
    void addBooks(){
        books[noOfBooks] = sc.nextLine();
    }
}

public class Labrary {
}
