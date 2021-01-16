/* This code replaces a numeral with the corresponding word from 0 to 11 in a text entered by the user*/

import java.util.*;
import java.lang.*;

public class ReplaceNumerals {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] firstLetterToCapitalize, firstLetterInWord;
        String text = scanner.nextLine();

        // splitting the text entered by the user into a new array ** the "\\s" splits the string based on whitespace
        String[] textIntoArray = text.split("\\s");

        String[] numeral = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"};
        String[] numeralToWord = {"zero", "one", "two", "three", "four", "five", "six", "seven",
                "eight", "nine", "ten", "eleven", "twelve"};

        for (int i = 0; i < textIntoArray.length; i++) {
            for (int j = 0; j < numeral.length; j++) {

                // this condition capitalizes the first letter of the number in words if it appears as first in sentence
                if (textIntoArray[0].equals(numeral[j])) {

                    textIntoArray[0] = textIntoArray[0].replaceAll(numeral[j], numeralToWord[j]);
                    firstLetterToCapitalize = textIntoArray[0].split("");
                    firstLetterInWord = numeralToWord[j].split("");
                    firstLetterToCapitalize[0] = firstLetterToCapitalize[0].toUpperCase();
                    textIntoArray[0] = textIntoArray[0].replace(firstLetterInWord[0], firstLetterToCapitalize[0]);
                }

                //check if each item of the array contains a numeral
                if  (textIntoArray[i].equals(numeral[j]) && i > 0) {

                    //if it does, the relevant numeral is replaced with the corresponding word
                    textIntoArray[i] = textIntoArray[i].replaceAll(numeral[j], numeralToWord[j]);
                }
            }
        }
        for (String s : textIntoArray) {
            System.out.print(s + " ");
        }
    }
}