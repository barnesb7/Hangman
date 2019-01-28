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
        String[] wordsAlreadyGuessed = new String[10];
        int numberOfTriesUsed = 0;

         do{

             userMenu.showMenu();
             wordInPlay = wordLibrary.getWordFromLibrary();
             wordInPlaySplit = wordInPlay.split("");

             String userInput = scanner.nextLine();



             if(userInput.matches("[A-Za-z]{1}")){
                 System.out.println("its a letter");
                 letterChest.addLetter(userInput);

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

         if(allLettersCorrect){
             hasGuessedWord = true;
         }

         }while(!hasGuessedWord || !hasUsedUpTries);

    }
}
