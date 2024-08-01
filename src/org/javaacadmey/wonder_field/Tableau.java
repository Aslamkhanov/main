package org.javaacadmey.wonder_field;

import java.util.Arrays;

public class Tableau {
   private String correctAnswer;
   private char[] lettersOnTheScoreboard;

    public Tableau(String correctAnswer, char[] lettersOnTheScoreboard) {
        this.correctAnswer = correctAnswer.toUpperCase();
        this.lettersOnTheScoreboard = new char[this.correctAnswer.length()];

        for (int i = 0; i < this.lettersOnTheScoreboard.length; i++) {
            this.lettersOnTheScoreboard[i] = '_';
        }
    }
    public void displayTableau() {
            if(isAttributesAreNotEmpty(lettersOnTheScoreboard)){
                System.out.println(lettersOnTheScoreboard + " ");
            }
    }

    public static boolean isAttributesAreNotEmpty(char[] lettersOnTheScoreboard) {
        for (char letter : lettersOnTheScoreboard) {
            if (letter != '_') {
                return true;
            }
        }
        return false;
    }
    public void showLetter(char letter) {
        for (int i = 0; i < correctAnswer.length(); i++) {
            if (correctAnswer.charAt(i) == letter) {
                lettersOnTheScoreboard[i] = letter;
                ContainsUnknownLetters();
            }
        }
        if (isAttributesAreNotEmpty(lettersOnTheScoreboard)) {
            System.out.println(Arrays.toString(lettersOnTheScoreboard));
        }else {
            System.out.println("_");
        }

    }

    public void showWord() {
        for (int i = 0; i < correctAnswer.length(); i++) {
            lettersOnTheScoreboard[i] = correctAnswer.charAt(i);
        }
    }
public  boolean ContainsUnknownLetters() {
        for (int i = 0; i < correctAnswer.length(); i++) {
            if (correctAnswer.charAt(i) == '_') {}
        }
        for (char letter : lettersOnTheScoreboard) {
            if (letter == '_') {
                return true;
            }
        }
        return false;
}

}
