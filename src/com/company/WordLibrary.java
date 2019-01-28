package com.company;

import java.util.Random;

public class WordLibrary {

    private Random random = new Random();
    private String[] wordLibrary = { "poser", "ghostbuster", "mullet",
                                    "puke", "goo", "pony"};


     public String getWordFromLibrary() {

         int index = random.nextInt(6);

         return wordLibrary[index];
     }


 }