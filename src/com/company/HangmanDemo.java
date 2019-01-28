package com.company;

import java.util.Scanner;

public class HangmanDemo {

    public static void main(String[] args) {

        WordLibrary wordLibrary = new WordLibrary();
        LetterChest letterChest = new LetterChest();
        UserMenu userMenu = new UserMenu();
        Scanner scanner = new Scanner(System.in);


        boolean hasGuessedWord = false;
        boolean hasUsedUpTries = false;
        boolean allLettersCorrect = false;

        String wordInPlay = "";
        String[] wordInPlaySplit;
        int numberOfTriesUsed = 0;

         do{

             wordInPlay = wordLibrary.getWordFromLibrary();
             wordInPlaySplit = wordInPlay.split("");


             do{

                 userMenu.showMenu();

                 String userInput = scanner.nextLine();

                 if(userInput.matches("[A-Za-z]{1}")){

                     letterChest.addLetter(userInput);

                     for(int i = 0; i < wordInPlaySplit.length; i ++){
                         if( wordInPlaySplit[i].equals(userInput)){
                             System.out.println(userInput + " - holds place " + (i+1) + " in the word.");
                             wordInPlaySplit[i] = ".";
                         }
                     }

                     // check how many guessed letters indexes we've reassigned
                     int hasGuessedWordCheck = 0;
                     for (int i = 0; i < wordInPlaySplit.length; i++){
                         if(wordInPlaySplit[i].equals(".")){
                             hasGuessedWordCheck++;
                         }
                     }

                     //check if all letters have been guessed
                     if (hasGuessedWordCheck == wordInPlay.length()){
                         hasGuessedWord = true;
                         System.out.println("CONGRATS! You've guessed the word " + wordInPlay + "!!!");
                     }


                     numberOfTriesUsed++;

                     if(numberOfTriesUsed == 10){
                         hasUsedUpTries = true;

                         System.out.println("You have used all 10 tries. Sorry.");
                     }

                 } else if(userInput.equals("1")){
                     System.out.println("Here's a letter");

                 } else if (userInput.equals("2")){
                     letterChest.printGuessedLetters();

                 }

             }while(!hasGuessedWord || !hasUsedUpTries);


         } while(!hasGuessedWord || !hasUsedUpTries);

    }
}
