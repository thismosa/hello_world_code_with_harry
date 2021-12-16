package com.company;
import java.util.Scanner;
class Game {
    int random;
    int count =0 ;
    int guessedNumber;
    Scanner sc = new Scanner(System.in);
    public Game(){
        random = 1 + (int)(Math.random() * 100);
        System.out.println("guess the number in the range 1,100");
        guessedNumber = sc.nextInt();
        count++;
        if (isCorrectNumber()){
            System.out.println("you won ");
            System.out.println("count = "+count);
        }
    }
    boolean isCorrectNumber( ){
        if (guessedNumber == random){
            return true;
        }
        else {
            return false;
        }
    }
    void greaterOrLesser(){
        if (guessedNumber < random){
            System.out.println("number is greater then " + guessedNumber);
        }
        else if (guessedNumber > random){
            System.out.println("number is lesser then"+guessedNumber);
        }
    }
    void playing (){
        while(!isCorrectNumber()){
            greaterOrLesser();
            guessedNumber = sc.nextInt();
            if(isCorrectNumber() ){
                System.out.println("you guesses the right number ");
                System.out.println("in "+ count+ "counts");

            }
            else{
                greaterOrLesser();
                count++;

            }
        }
    }

        }



public class guessTheNumber {

    // create a class game which allows the user to play the guess the number game
    // game should have the following methords
    // 1 ) constructor to genrate the random no.
    // 2) takeing user input to take the user of the input
    // 3) iscorrectnumber to know where the number is same true
    // use property number of guesses (int)
    public static void main(String[] args) {
        Game game = new Game();
        game.playing();
    }

}
