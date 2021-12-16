package com.company;

public class metords {
    // metords and methord overloading learned already

    // now elarn var arg
    static int sum(int ... arr){
        // it gives all the arrugmets in array called arr which we have named
        // like arr[]
        int sum = 0 ;
        for(int elm : arr){
            sum += elm;
        }
        return sum;


    }
    public static void paternPrint(int n){
        n ++;
        for(int i = 1 ; i < n ; i++){
            for(int j = 0 ; j<i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        paternPrint(3);
    }
}
