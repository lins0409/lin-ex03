/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Sue Lin
 */

package exercise03;

import java.util.Scanner;

/*
* this is the pseudocode
* Create a program that prompts for a quote and an author. Display the quotation and author as shown in the example output.
*   -print out prompt asking for string
*   -create variable to store string
*   -print out prompt asking for the author
*   -create variable to store author name
*   -print out the author and the quote
 */

public class Solution03 {
    public static void main (String[] args)
    {
        System.out.print("What is the quote? ");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        System.out.print("Who said it? ");
        String author = scanner.nextLine();
        char quote = '"';
        System.out.println(author + " says, " + quote + string + quote);
    }
}
