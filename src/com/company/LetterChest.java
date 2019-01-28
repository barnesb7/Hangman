package com.company;

import java.util.Arrays;

public class LetterChest {

    String[] letterChest = new String[10];

    public void addLetter(String inputLetter){
        for(int i = 0; i < letterChest.length; i++){
            if(letterChest[i] == null){
                letterChest[i] = inputLetter;
                break;
            }
        }
    }

    public void printGuessedLetters(){
        System.out.println(Arrays.toString(letterChest));
    }
}
