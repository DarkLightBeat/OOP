/*Using Java programming language, create a program that:

uses data type and variables
uses  input and output statement;
uses comments and escape sequence;
solve a problem using computing solution (arithmetic operators);*/

import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        
        Scanner input = new Scanner(System.in);
        
        
        System.out.println("Student Information ");
        // Prompt user for student number
        System.out.print("\tEnter your student number: ");
        String studentNumber = input.nextLine();
        
        // Prompt user for last name
        System.out.print("\tEnter your last name: ");
        String lastName = input.nextLine();
        
        // Prompt user for first name
        System.out.print("\tEnter your first name: ");
        String firstName = input.nextLine();
        
        //Prompt user for middle name
        System.out.print("\tEnter your middle name: ");
        String middleName = input.nextLine();
        
        // Prompt user for course
        System.out.print("\tEnter your course: ");
        String course = input.nextLine();
        
        //Prompt user for year
        System.out.print("\tEnter your year: ");
        int year = input.nextInt();
        
        System.out.println("\nAssessment Information");
        // Prompt user for tuition fee
        System.out.print("\tEnter your tuition fee: ");
        double tuitionFee = input.nextDouble();
        
        // Prompt user for miscellneous fee
        System.out.print("\tEnter your miscellneous fee: ");
        double miscFee = input.nextDouble();
        
        // Prompt user for auxillary fee
        System.out.print("\tEnter your auxillary fee: ");
        double auxFee = input.nextDouble();
        
        // Prompt user for laboratory fee
        System.out.print("\tEnter your laboratory fee: ");
        double labFee = input.nextDouble();
        
        // Calculate assessment with discount
        double baseTuitionFee = tuitionFee + miscFee + auxFee + labFee;
        double discount = 0.10 * (year - 1);
        double assessment = baseTuitionFee - discount * baseTuitionFee;
        
        //Display Student Records
        System.out.println("\n\nRecords: ");
        System.out.println(String.format("\tStudent Number: %s", studentNumber));
        System.out.println(String.format("\tName: %s, %s %s", lastName, firstName, middleName));
        System.out.println(String.format("\tCourse: %s", course));
        System.out.println(String.format("\tYear: %s", year));
        System.out.println(String.format("\tAssessment: ₱%.2f", assessment));
        
        // Close the scanner
        input.close();
    }
}
