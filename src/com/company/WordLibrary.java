package com.company;

import java.util.Random;

public class WordLibrary {

    private Random random = new Random();
    private String[] wordLibrary = { "goop"};


     public String getWordFromLibrary() {

         int index = random.nextInt(1);

         return wordLibrary[index];
     }


 }