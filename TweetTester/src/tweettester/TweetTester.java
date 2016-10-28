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
        int chars = 0;
        String lines = scan.nextLine();
        
        for(int i = 0; i < lines.length(); i++)
        {
            chars++;
        }
        
        System.out.println(chars);
    }
}
