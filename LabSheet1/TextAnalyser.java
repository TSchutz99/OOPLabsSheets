package LabSheet1;
/* TextAnalyser.java
 * By: Faun Schutz
 * Start: 22/09/2020
 * Finish: 22/09/2020
 */
import java.util.Scanner;

public class TextAnalyser {
    public static void main(String[] args)  {
        int loop = 0, lowerCaseVowels, words, totalWords = 0, edAppears;
        String text, shortestText = "";
        char character, character2 = ' ';

        Scanner input = new Scanner(System.in);

        do{
            System.out.print("\nPleas enter piece of text " + (loop+1) +": ");
            text = input.nextLine();

            int loop2 = 0; 
            words = 0;
            lowerCaseVowels = 0;
            edAppears = 0;

            while(loop2 < text.length())
            {
                character = text.charAt(loop2);

                if(loop2 < text.length() -1)
                    character2 = text.charAt(loop2+1);

                if(character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u')
                    lowerCaseVowels++;

                if(character == ' ')
                    words++;

                if(character == 'e' && character2 == 'd')
                    edAppears++;

                loop2++;
            }

            System.out.print("\n\t------Text Data------\n" +
                             "\nNumber of characters: " + text.length() +
                             "\nNumber of lowercase vowels: " + lowerCaseVowels +
                             "\nNumber of words: " + (words+1) +
                             "\nNumber of times \"ed\" appears in the text: " + edAppears + "\n");

            if(loop == 0)
                shortestText = text;
            else if(text.length() < shortestText.length())
                shortestText = text;

            totalWords += (words+1);

            loop++;
        }while(loop < 3);

        System.out.print("\n\t------Overall Results------\n\n" +
                         "\nShortest piece of text: " + shortestText +
                         "\nAverage number of words: " + String.format("%.0f",(totalWords/3f)));
    }
}
