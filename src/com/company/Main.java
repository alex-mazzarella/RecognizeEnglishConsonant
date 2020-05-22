package com.company;

import acm.program.ConsoleProgram;

/***Console Program - prints all upper case English consonants.
 * implement method isEnglishConsonant*/

public class Main extends ConsoleProgram {

    public static void main(String[] args) {

        (new com.company.Main()).start();
    }

    public void run() {
    for(char ch= 'A';ch<'Z';ch++)
        if(isEnglishConsonant(ch)) println(ch);
    }

    private boolean isEnglishConsonant(char ch) {
        switch (Character.toLowerCase(ch)) {
            case 'a': case 'e': case 'i': case 'o': case 'u':
            case 'A': case 'E': case 'I': case 'O': case 'U':
                return false;
            default:
                return true;
        }
    }
}