import java.text.CharacterIterator;
import java.text.StringCharacterIterator;
import java.util.Scanner;

public class Exercise08 {
    // Exercise R - 1.8
    /**
     * A java method the counts the number of vowels
     * in a given character string
     */
    public static void main(String[] args){
        // taking input of string
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = input.next();
    }

    // using the String.toCharArray()

    /**
     * first we convert the string into an array of character
     * using String.toCharArray() method
     * then you iterate through  the character
     */
    static void iterateString(String word){
        // converting the string into an array of characters
        char[] arrChar = word.toCharArray();

        // travers the character array
        for (int i = 0; i < arrChar.length; i++){

        }

    }

}
