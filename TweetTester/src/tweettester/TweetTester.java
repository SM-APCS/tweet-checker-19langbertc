/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tweettester;

import java.util.Scanner;
import java.lang.Math; 
/**
 * @class  AP CSA
 * @author Carter Langbert
 */
public class TweetTester {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner (System.in);
        String tweet;
        // Define an int to keep track of the number of character
        int chars = 0;
        // Use the nextLine method to define a string
        String lines = scan.nextLine();
        
        // Set a for loop to run lines.length() times
        for(int i = 0; i < lines.length(); i++)
        {
            // Increase the char count every time the for loop runs to
            // keep track of the number of characters in the lines string
            chars++;
        }
        
        // Print out the total numbers of characters of the tweet
        System.out.println(chars);
    }
}
