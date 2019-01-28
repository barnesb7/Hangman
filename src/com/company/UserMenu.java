package com.company;

public class UserMenu {

    public String NEWLINE = "\n";
    private String startingPrompt = "You have 10 tries to guess a word.";
    private String wordlength = "The words length is ??? input a letter or choose an option";
    private String hintOption = "[1] Get a letter hint";
    private String lettersGuessedOption = "[2] Show letters already guessed";


    public void showMenu(){
        System.out.println(startingPrompt + NEWLINE + wordlength + NEWLINE + hintOption + NEWLINE + lettersGuessedOption);
    }
}
