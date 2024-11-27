import javax.swing.JOptionPane;
public class Main{
    public static void main(String[] args){
        
        Arithmetic getOperators = new Arithmetic();
        int firstInput, secondInput, thirdInput, fourthInput, fifthInput;
        double average;
        String input;
        
        
        input = JOptionPane.showInputDialog(null, "Enter your grade: ");
        firstInput = Integer.parseInt(input);
        
        input = JOptionPane.showInputDialog(null, "Enter your grade: ");
        secondInput = Integer.parseInt(input);
        
        input = JOptionPane.showInputDialog(null, "Enter your grade: ");
        thirdInput = Integer.parseInt(input);
        
        input = JOptionPane.showInputDialog(null, "Enter your grade: ");
        fourthInput = Integer.parseInt(input);
        
        input = JOptionPane.showInputDialog(null, "Enter your grade: ");
        fifthInput = Integer.parseInt(input);
            
        average = getOperators.getAverage(firstInput, secondInput, thirdInput, fourthInput, fifthInput);
        
        
        if(average >= 75){
            JOptionPane.showMessageDialog(null, "Grade Average: " + average + "\nYou Passed", "AVERAGE", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Grade Average: " + average + "\nYou Failed", "METHODS", JOptionPane.INFORMATION_MESSAGE);
        }     
    }
}   


public class Arithmetic {

    int getAverage(int firstInput, int secondInput, int thirdInput,int fourthInput,int fifthInput){
        int sum, average;
        sum = firstInput + secondInput + thirdInput + fourthInput + fifthInput;
        average = sum / 5;
        return average;
    };

}
