import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        while(true) {
            System.out.print("Enter your grade: ");
            int grade = input.nextInt();
        
            if(grade >= 50) {
                System.out.println("Valid grade!");
            } else {
                System.out.println("Passing Grades:");
                System.out.println("Percentage Equivalent                Final Grade");
                System.out.println("1.00                                 98 - 100");
                System.out.println("1.25                                 95 - 97");
                System.out.println("1.50                                 92 - 94");
                System.out.println("1.75                                 89 - 91");
                System.out.println("2.00                                 87 - 88");
                System.out.println("2.25                                 84 - 86");
                System.out.println("2.50                                 81 - 83");
                System.out.println("2.75                                 78 - 80");
                System.out.println("3.00                                 75 - 77");
                System.out.println();
                System.out.println("Failing Grades:");
                System.out.println("Percentage Equivalent                Final Grade");
                System.out.println("5.00                                 74 and below");
            } 
        }
    }
}
