/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Jordan Snoap
 */

package org.example;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    // Function designed to convert euros to dollars.
    // Prompts for amount of money in euros (int) and the exchange rate of the euro (double).
    // Prints amount in USD
    public static void main( String[] args )
    {
        int euros;
        double rate, usd;

        System.out.println("How many euros are you exchanging?");
        Scanner inputEuro = new Scanner(System.in);
        euros = inputEuro.nextInt();

        System.out.println("What is the exchange rate?");
        Scanner inputRate = new Scanner(System.in);
        rate = inputRate.nextDouble();

        usd = rate * euros;

        // This format will round up the fractions of cent to nearest penny
        System.out.println(euros + " euros at an exchange rate of " + rate + " is " + String.format("%.2f", usd) + " U.S. dollars.");
    }
}
