package com.company;

import java.util.Random;
import java.util.Scanner;

public class HangmanDemo {

    public static void main(String[] args) {

        WordLibrary wordLibrary = new WordLibrary();
        LetterChest letterChest = new LetterChest();
        UserMenu userMenu = new UserMenu();
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();


        boolean hasGuessedWord = false;
        boolean hasUsedUpTries = false;
        boolean allLettersCorrect = false;

        String wordInPlay = "";
        String[] wordInPlayArray;
        int numberOfTriesUsed = 0;
        int numberOfHintTriesUsed = 0;
        String previousHintGiven = "?";

         do{

             wordInPlay = wordLibrary.getWordFromLibrary();
             wordInPlayArray = wordInPlay.split("");


             do{

                 userMenu.showMenu();
                 System.out.println("The word to guess is " + wordInPlay.length() + " letters long.");
                 String userInput = scanner.nextLine();

                 if(userInput.matches("[A-Za-z]{1}")){

                     letterChest.addLetter(userInput);

                     for(int i = 0; i < wordInPlayArray.length; i ++){
                         if( wordInPlayArray[i].equals(userInput)){
                             System.out.println(userInput + " - holds place " + (i+1) + " in the word.");
                             wordInPlayArray[i] = ".";
                         }
                     }

                     // check how many guessed letters indexes we've reassigned
                     int hasGuessedWordCheck = 0;
                     for (int i = 0; i < wordInPlayArray.length; i++){
                         if(wordInPlayArray[i].equals(".")){
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

                            if(numberOfHintTriesUsed == 2){
                                System.out.println("Sorry, but you have already used your 2 hints for this word.");
                            } else {

                                boolean hintWasGiven = false;
                                do {
                                    int randomIndex = random.nextInt(wordInPlayArray.length);

                                    if (!wordInPlayArray[randomIndex].equals(".") && !wordInPlayArray[randomIndex].equals(previousHintGiven)) {
                                        System.out.println(wordInPlayArray[randomIndex] + " holds the " + (randomIndex + 1) + " place in this word.");
                                        previousHintGiven = wordInPlayArray[randomIndex];
                                        hintWasGiven = true;
                                        break;
                                    }

                                }while(!hintWasGiven);
                            }

                     numberOfHintTriesUsed++;

                 } else if (userInput.equals("2")){
                     letterChest.printGuessedLetters();

                 }

             }while(!hasGuessedWord || !hasUsedUpTries);


         } while(!hasGuessedWord || !hasUsedUpTries);

    }
}
