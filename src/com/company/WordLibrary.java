package com.company;

import java.util.Random;

public class WordLibrary {


    private Random random = new Random();
    private String[] wordLibrary = { "goop", "fuzz", "goo", "booger", "slime",
                                    "gak", "grease", "grime", "nugget", "mold",
                                    "fungus", "mucus", "flem", "muck", "mud",
                                    "sludge", "slurry", "ooze", "slop", "scum"  };


     public String getWordFromLibrary() {

         int index = random.nextInt(20);

         return wordLibrary[index];
     }

     public void printSpecificWordClue(String wordInput){

        String stringToPrint = "";

        switch (wordInput){

            case "goop":   stringToPrint = "Old hand cleaner used to cut grease.";
            break;

            case "fuzz":   stringToPrint = "Guitar pedal effect.";
                break;

            case "goo":   stringToPrint = "Yucky nasty stuff.";
                break;

            case "booger":   stringToPrint = "From the nose.";
                break;

            case "slime":   stringToPrint = "Covered on Nickelodeon.";
                break;

            case "gak":   stringToPrint = "Sticky and funny noise toy from the 90's.";
                break;

            case "grease":   stringToPrint = "John Travolta type stuff.";
                break;

            case "grime":   stringToPrint = "Singular of famous female electronic musician.";
                break;

            case "nugget":   stringToPrint = "Denver basketball.";
                break;

            case "mold":   stringToPrint = "After the flood.";
                break;

            case "fungus":   stringToPrint = "Among us.";
                break;

            case "mucus":   stringToPrint = "Lots in the 90's Mario bros movie.";
                break;

            case "flem":   stringToPrint = "Cough it up.";
                break;

            case "muck":   stringToPrint = "Spinal tap knows about it.";
                break;

            case "mud":   stringToPrint = "Some call the drink Missippi _____.";
                break;

            case "sludge":   stringToPrint = "Heavy music genre.";
                break;

            case "slurry":   stringToPrint = "Flowin' from a coal mine.";
                break;

            case "ooze":   stringToPrint = "Creates Teenage Mutant Ninja Turtles.";
                break;

            case "slop":   stringToPrint = "Babe the pig eats it";
                break;

            case "scum":   stringToPrint = "Much of the present days executive branch.";
                break;
        }

         System.out.println("Clue: " + stringToPrint);
     }


 }