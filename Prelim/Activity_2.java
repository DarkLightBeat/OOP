import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        /* The purpose of the code is to know the equivalent grade of numerical into percentage */
        //Prompt user about grade
        System.out.print("Enter your grade (1.00 - 5.00): ");
        Double grade = input.nextDouble();
        
        if (grade == 1.00){
            System.out.print("Your equivalent grade is 98 to 100");
        }
        
        else if (grade <= 1.25){
            System.out.print("Your equivalent grade is 95 to 97");
        }
        
        else if (grade <= 1.50){
            System.out.print("Your equivalent grade is 92 to 94");
        }
        
        else if (grade <= 1.75){
            System.out.print("Your equivalent grade is 89 to 91");
        }
        
        else if (grade <= 2.00){
            System.out.print("Your equivalent grade is 86 to 88");
        }
        
        else if (grade <= 2.25){
            System.out.print("Your equivalent grade is 83 to 85");
        }
        
        else if (grade <= 2.50){
            System.out.print("Your equivalent grade is 80 to 82");
        }
        
        else if (grade <= 2.75){
            System.out.print("Your equivalent grade is 78 to 79");
        }
        
        else if (grade <= 3.00){
            System.out.print("Your equivalent grade is 75 to 77");
        }
        
        else {
            System.out.print("Your equivalent grade is 75 below");
        }
        
        input.close();
    }
}
