/**
 * Problem Set 3.
 * 
 * It's time to put your skills to the test. This problem set focuses on using
 * conditional control structures. It's also your first introduction to methods,
 * so things look a little different. The main method is done for you. Lines 31-40
 * trigger each of the predefined methods, which you can think of as self-contained
 * executable pieces of logic. Write your code for each exercise in the
 * corresponding method.
 * 
 * The specifications for each exercise are outlined below. Your job is to write
 * lines of code to produce answers to my questions. Each exercise requires that
 * you ask the user to enter one or more values. Your code must meet the
 * requirements set forth in this section (as well as the Deliverables section).
 * 
 * Work through these exercises on your own. Experiment, make mistakes, ask
 * questions, and fix your mistakes. It's the only way to get good at programming.
 */

import java.util.Scanner;

public class ProblemSet3 {
    
    private static Scanner in = new Scanner(System.in);
    
    public static void main(String[] args) {
        ProblemSet3 ps = new ProblemSet3();
        
        // comment out or uncomment as needed
        
//        ps.sign();          // executes Exercise 1
//        ps.parity();        // executes Exercise 2
//        ps.ordered();       // executes Exercise 3
//Muy mal        ps.gpa();           // executes Exercise 4
//        ps.grade();         // executes Exercise 5
        ps.cards();         // executes Exercise 6
//        ps.leapYear();      // executes Exercise 7
        ps.state();         // executes Exercise 8
        ps.months();        // executes Exercise 9
        ps.salary();        // executes Exercise 10
        
        in.close();
    }
    
    /*
     * Exercise 1.
     * 
     * Prompt the user to enter an integer. Is it positive, negative, or zero?
     */
    
    public void sign() {
        System.out.print("\nEnter an integer: ");
        long input = in.nextLong();

        if (input > 0) {
            System.out.println("\nPositive.");
        } else if (input < 0) {
            System.out.println("\nNegative.");
        } else {
            System.out.println("\nZero.");
        }
    }
    
    /*
     * Exercise 2.
     * 
     * Prompt the user to enter an integer. Is it even or odd?
     */
    
    public void parity() {
        System.out.print("\nEnter an integer: ");
        long input = in.nextLong();

        if ((input % 2) == 0) {
            System.out.println("\nEven.");
        } else {
            System.out.println("\nOdd.");
        }
    }
    
    /*
     * Exercise 3.
     * 
     * Prompt the user to enter three integers. How are the integers ordered?
     */
    
    public void ordered() {
        System.out.println("\nEnter three integers.");

        System.out.print("\nEnter integer: ");
        long input1 = in.nextLong();
        System.out.print("Enter integer: ");
        long input2 = in.nextLong();
        System.out.print("Enter integer: ");
        long input3 = in.nextLong();

        if (input3 == input2 && input2 == input1) {
            System.out.println("\nSame.");
        } else if (input3 > input2 && input2 > input1) {
            System.out.println("\nStrictly increasing.");
        } else if (input3 >= input2 && input2 >= input1) {
            System.out.println("\nIncreasing.");
        } else if (input3 < input2 && input2 < input1) {
            System.out.println("\nStritly decreasing.");
        } else if (input3 <= input2 && input2 <= input1) {
            System.out.println("\nDecreasing.");
        } else if (input3 <= input2 && input2 <= input1) {
            System.out.println("\nDecreasing.");
        } else {
            System.out.println("\nUnordered.");
        }
    }
    
    /*
     * Exercise 4.
     * 
     * Prompt the user to enter a letter grade. What's the corresponding GPA?
     */
    
    public void gpa() {
        // System.out.print("Enter a letter grade: ");
        // String input = in.next();
        // String letter = String.valueOf(input.charAt(0));
        // try {
        //     String additive = String.valueOf(input.charAt(1));
        // } catch (Exception e) {

        // }
        // double gpaVar = 0;
        
        // if (letter == "A") {
        //     gpaVar += 4.00;
        // } else if (letter == "B") {
        //     gpaVar += 3.00;
        // } else if (letter == "C") {
        //     gpaVar += 2.00;
        // } else if (letter == "D") {
        //     gpaVar += 1.00;
        // } else if (letter == "F") {
        //     gpaVar += 0.00;
        // }

        // if (letter == "F") {

        // } else {
        //     // if (additive == null) {

        //     // } else if (additive == '+') {
        //     //     gpa += 0.33;
        //     // } else if (additive == '-') {
        //     //     gpa -= 0.33;
        //     // }
        // }
        

        // System.out.printf("Your GPA is %.2f.", gpaVar);
    }
    
    /*
     * Exercise 5.
     * 
     * Prompt the user to enter a grade. What's the corresponding letter grade?
     */
    
    public void grade() {
        System.out.print("\nEnter a grade: ");
        double grade = in.nextDouble();

        if (grade >= 90 && grade <= 100) {
            System.out.println("\nYou recieved an A.");
        } else if (grade < 90 && grade >= 80) {
            System.out.println("\nYou recieved a B.");
        } else if (grade < 80 && grade >= 70) {
            System.out.println("\nYou recieved a C.");
        } else if (grade < 70 && grade >= 60) {
            System.out.println("\nYou recieved a D.");
        } else if (grade < 60 && grade >= 0) {
            System.out.println("\nYou recieved an F.");
        } else if (grade < 0) {
            System.out.println("\nGrades below 0 are invalid.");
        } else if (grade > 100) {
            System.out.println("\nGrades above 100 are invalid.");
        }

    }
    
    /*
     * Exercise 6.
     * 
     * Prompt the user to enter a playing card. What card was entered?
     */
    
    public void cards() {

    }
    
    /*
     * Exercise 7.
     * 
     * Prompt the user to enter a year. Is it a leap year or not?
     */
    
    public void leapYear() {
        System.out.print("\nEnter a year: ");
        long year = in.nextLong();

        if (year >= 0){
            if ((year%4 == 0) && ((year%100 != 0) || (year%400 == 0))) {
                System.out.printf("\n%d is a leap year.", year);
            } else {
                System.out.printf("\n%d is not a leap year.", year);
            }
        }
    }
    
    /*
     * Exercise 8.
     * 
     * Prompt the user to enter a temperature. At that temperature, is water a solid,
     * liquid, or gas?
     */
    
    public void state() {
        System.out.print("\nEnter a temperature: ");
        double temperature = in.nextDouble();
        System.out.print("\nEnter a scale: ");
        String scale = in.next();

        if (scale == "C") {
            if (temperature >= 100) {
                System.out.println("Gas.");
            } else if (0 < temperature && temperature < 100) {
                System.out.println("Liquid.");
            } else {
                System.out.println("Solid.");
            }
        } else if (scale == "F") {
            if (temperature >= 212) {
                System.out.println("Gas.");
            } else if (32 < temperature && temperature < 212) {
                System.out.println("Liquid.");
            } else {
                System.out.println("Solid.");
            }
        }

        
    }
    
    /*
     * Exercise 9.
     * 
     * Prompt the user to enter a month. How many days are in that month?
     */
    
    public void months() {        

    }
    
    /*
     * Exercise 10.
     * 
     * Prompt the user to enter a wage and hours worked. How much money will be made?
     */
    
    public void salary() {

    }
}