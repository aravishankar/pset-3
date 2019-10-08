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
        
        ps.sign();          // executes Exercise 1
        ps.parity();        // executes Exercise 2
        ps.ordered();       // executes Exercise 3
        ps.gpa();           // executes Exercise 4
        ps.grade();         // executes Exercise 5
        ps.cards();         // executes Exercise 6
        ps.leapYear();      // executes Exercise 7
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
        long firstInteger = in.nextLong();
        System.out.print("Enter integer: ");
        long secondInteger = in.nextLong();
        System.out.print("Enter integer: ");
        long thirdInteger = in.nextLong();

        if (thirdInteger == secondInteger && secondInteger == firstInteger) {
            System.out.println("\nSame.");
        } else if (thirdInteger > secondInteger && secondInteger > firstInteger) {
            System.out.println("\nStrictly increasing.");
        } else if (thirdInteger >= secondInteger && secondInteger >= firstInteger) {
            System.out.println("\nIncreasing.");
        } else if (thirdInteger < secondInteger && secondInteger < firstInteger) {
            System.out.println("\nStritly decreasing.");
        } else if (thirdInteger <= secondInteger && secondInteger <= firstInteger) {
            System.out.println("\nDecreasing.");
        } else if (thirdInteger <= secondInteger && secondInteger <= firstInteger) {
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

        System.out.print("\nEnter a letter grade: ");
        String input = in.next();
        String letter = String.valueOf(input.charAt(0));
        String additive = "Arbitrary Value";
        try {
            additive = String.valueOf(input.charAt(1));
        } catch (Exception e) {
            //Nothing
        }
        double gpaVar = 0;

        switch (letter) {
            case "A":
                gpaVar += 4.00;
                break;

            case "B":
                gpaVar += 3.00;
                break;
            
            case "C":
                gpaVar += 2.00;
                break;
            
            case "D":
                gpaVar += 1.00;
                break;
            
            case "F":
                gpaVar += 0.00;
                break;
            
            default:
                System.out.println("\nThat's not a valid letter grade.");
                break;
        }

        if (letter == "F") {
            //Do Nothing
        } else if (letter == "A") {
            if (additive == "-") {
                gpaVar -= 0.33;
            }
        } else {
            switch (additive) {
                case "+":
                    gpaVar += 0.33;
                    break;

                case "-":
                    gpaVar -= 0.33;
                    break;
                
                default:
                    break;
            }

        }

        System.out.printf("\nYour GPA is %.2f.\n", gpaVar);

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

        System.out.print("\nEnter a card: ");
        String card = in.next();
        String rank = card.substring(0, 1);
        String suite = card.substring(1);
        String fullRank = "Yeet";
        String fullSuite = "Yeet";
        boolean legit = false;

        switch (rank) {
            case "2":
                fullRank = "Two";
                legit = true;
                break;

            case "3":
                fullRank = "Three";
                legit = true;                
                break;

            case "4":
                fullRank = "Four";
                legit = true;
                break;

            case "5":
                fullRank = "Five";
                legit = true;
                break;

            case "6":
                fullRank = "Six";
                legit = true;
                break;

            case "7":
                fullRank = "Seven";
                legit = true;
                break;

            case "8":
                fullRank = "Eight";
                legit = true;
                break;

            case "9":
                fullRank = "Nine";
                legit = true;
                break;

            case "T":
                fullRank = "Ten";
                legit = true;
                break;

            case "J":
                fullRank = "Jack";
                legit = true;
                break;

            case "Q":
                fullRank = "Queen";
                legit = true;
                break;

            case "K":
                fullRank = "King";
                legit = true;
                break;

            case "A":
                fullRank = "Ace";
                legit = true;
                break;
 
            default:
                System.out.println("That's not a valid rank.");
                legit = false;
                break;
        }        

        if (legit) {
            switch (suite) {
                case "C":
                    fullSuite = "Clubs";
                    legit = true;
                    break;

                case "D":
                    fullSuite = "Diamonds";
                    legit = true;
                    break;

                case "H":
                    fullSuite = "Hearts";
                    legit = true;
                    break;

                case "S":
                    fullSuite = "Spades";
                    legit = true;
                    break;
                
                default:
                    System.out.println("\nThat's not a valid suit.");
                    legit = false;
                    break;
            }
        }
        
        if (legit) {
            System.out.println("\n" + fullRank + " of " + fullSuite + ".");
        }

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
            if ((year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0))) {
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

        System.out.print("\n\nEnter a temperature: ");
        double temperature = in.nextDouble();
        System.out.print("Enter a scale: ");
        String scale = in.next();

        switch (scale) {
            case "C":
                if (temperature >= 100) {
                    System.out.println("\nGas.");
                } else if (0 < temperature && temperature < 100) {
                    System.out.println("\nLiquid.");
                } else {
                    System.out.println("\nSolid.");
                }
                break;

            case "F":
                if (temperature >= 212) {
                    System.out.println("\nGas.");
                } else if (32 < temperature && temperature < 212) {
                    System.out.println("\nLiquid.");
                } else {
                    System.out.println("\nSolid.");
                }
                break;
            
            default:
                System.out.println("\nThat's not a valid scale.");
                break;
        }

        
    }
    
    /*
     * Exercise 9.
     * 
     * Prompt the user to enter a month. How many days are in that month?
     */
    
    public void months() {

        System.out.print("\nEnter a month: ");
        String month = in.next();

        if (month.length() == 3) {
            switch (month) {
                case "Jan":
                    System.out.println("\n31 days.");
                    break;
                
                case "Feb":
                    System.out.println("\n28 or 29 days.");
                    break;
            
                case "Mar":
                    System.out.println("\n31 days.");
                    break;

                case "Apr":
                    System.out.println("\n30 days.");
                    break;

                case "May":
                    System.out.println("\n31 days.");
                    break;

                case "Jun":
                    System.out.println("\n30 days.");
                    break;

                case "Jul":
                    System.out.println("\n31 days.");
                    break;
            
                case "Aug":
                    System.out.println("\n31 days.");
                    break;

                case "Sep":
                    System.out.println("\n30 days.");
                    break;

                case "Oct":
                    System.out.println("\n31 days.");
                    break;

                case "Nov":
                    System.out.println("\n30 days.");
                    break;

                case "Dec":
                    System.out.println("\n31 days.");
                    break;
            
                default:
                    System.out.println("\nThat's not a valid month.");
                    break;
            }
        } else if (month.length() == 4) {
            switch (month) {
                case "Janu":
                    System.out.println("\n31 days.");
                    break;
                
                case "Febr":
                    System.out.println("\n28 or 29 days.");
                    break;
            
                case "Marc":
                    System.out.println("\n31 days.");
                    break;

                case "Apri":
                    System.out.println("\n30 days.");
                    break;

                case "June":
                    System.out.println("\n30 days.");
                    break;

                case "July":
                    System.out.println("\n31 days.");
                    break;
            
                case "Augu":
                    System.out.println("\n31 days.");
                    break;

                case "Sept":
                    System.out.println("\n30 days.");
                    break;

                case "Octo":
                    System.out.println("\n31 days.");
                    break;

                case "Nove":
                    System.out.println("\n30 days.");
                    break;

                case "Dece":
                    System.out.println("\n31 days.");
                    break;
            
                default:
                    System.out.println("\nThat's not a valid month.");
                    break;
            }
        } else {
            switch (month) {
                case "January":
                    System.out.println("\n31 days.");
                    break;
                
                case "February":
                    System.out.println("\n28 or 29 days.");
                    break;
            
                case "March":
                    System.out.println("\n31 days.");
                    break;

                case "April":
                    System.out.println("\n30 days.");
                    break;

                case "June":
                    System.out.println("\n30 days.");
                    break;

                case "July":
                    System.out.println("\n31 days.");
                    break;
            
                case "August":
                    System.out.println("\n31 days.");
                    break;

                case "September":
                    System.out.println("\n30 days.");
                    break;

                case "October":
                    System.out.println("\n31 days.");
                    break;

                case "November":
                    System.out.println("\n30 days.");
                    break;

                case "December":
                    System.out.println("\n31 days.");
                    break;
            
                default:
                    System.out.println("\nThat's not a valid month.");
                    break;
            }
        }

    }
    
    /*
     * Exercise 10.
     * 
     * Prompt the user to enter a wage and hours worked. How much money will be made?
     */
    
    public void salary() {
        
        final double OVERTIME_THRESHOLD = 40;
        final double OVERTIME_PAY_MULTIPLIER = 1.5;
        
        System.out.print("\nWage: ");
        double wage = in.nextDouble();
        if (wage < 0.00) {
            System.out.println("Your wage must be greater than or equal to $0.00/hour.");
        }
        System.out.print("Hours: ");
        double hours = in.nextDouble();
        if (hours < 0.0) {
            System.out.println("Your hours must be greater than or equal to 0.0.");
        }
        double pay;
        double overtimeHours;

        if (hours > OVERTIME_THRESHOLD) {
            overtimeHours = hours - OVERTIME_THRESHOLD;
            pay = 40 * wage + overtimeHours * OVERTIME_PAY_MULTIPLIER * wage;
            System.out.printf("\nYou'll make $%,.2f this week.\n", pay);
        } else {
            pay = hours * wage;
            System.out.printf("\nYou'll make $%,.2f this week.\n", pay);
        }
    }
}