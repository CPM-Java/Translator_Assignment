/**
 * Demonstration source code.
 * Demonstrates use of:
 *   console interface and model objects
 *   while loops
 *   if else logic
 *   
 *   DO NOT MODIFY THIS CLASS
 * 
 * @author GrayKnight  CPM 2017
 * @version 10/11/12, 10/20/17
 */
import java.util.Scanner;

//You have already seen a few examples of 'while' loops in other assignments
// where you were given the implementation for a UI on the console. 
//Read the line comments below to see key components of 'while" loop implementation.
public class LanguageDriver
{
    private Scanner scan = new Scanner(System.in);  // for Strings
    private Scanner scan2 = new Scanner(System.in); // for integer

    //surveys the user for information
    //controls execution
    public void userInput()
    {
        //while loops need to check the condition of an identifier often called a 'sentinel' variable
        //A sentinel variable needs to be declared and initialized before the while statement.
        String check = "y"; //'check'is being used here as a sentinel identifier
        
      
        //The 'while' statment checks a condtional expression just like an 'if' statement.
        //If the condtion is 'false' then all of the implementation between its { } is skipped.
        //It 'true' then the looping begins
        while(check.equals("y"))
        {
            System.out.println("\nEnter a word for translation:");
            String word1 = scan.nextLine();
            
            System.out.println("\nEnter syllable to be inserted:");
            String syllab = scan.nextLine();
            
            syllab = syllab.toUpperCase() + "'";
            
            System.out.println("\nInsert syllable every ___ number of characters?");
            int skip = scan2.nextInt();
            
            //default value for skip
            if(skip < 1 || skip > word1.length()) skip = 3;
            
            Translator trans = new Translator(syllab,skip);
            System.out.println(trans);
            System.out.println(trans.translate(word1));
            
            //Somewhere within the 'while' { } the sentinel value or condition needs an opportunity to change
            // or else the program gets stuck in the loop until it crashes. 
            //An 'endless loop' is a common logic error when using 'while' statements
            //Here the user is offered an opportunity to exit the loop.
            System.out.print("Try Again? (y or n):");
            check = scan.nextLine(); 
            
        // When control reaches this last curly brace the 'while' condition is checked again.    
        } // If 'true' the loop is repeated, if 'false' the loop is skipped.
        
        System.out.print("Goodbye!\n\n");
    }
}
