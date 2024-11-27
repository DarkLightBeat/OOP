import javax.swing.JOptionPane;

public class Villabroza {
    public static void main(String[] args) {
       int[] arrayNumberA = new int[5];
       int[] arrayNumberB = new int[5];
       int index;
       String input_1, input_2, listOfNumbers = "";
       
       for(index = 0; index < 5; index++ ){
           input_1 = JOptionPane.showInputDialog("Array A ["+index+"]: ");
           arrayNumberA[index]=Integer.parseInt(input_1);
       }
       
       for(index = 0; index < 5; index++ ){
           input_2 = JOptionPane.showInputDialog("Array B ["+index+"]: ");
           arrayNumberB[index]=Integer.parseInt(input_2);
       }

       for(index = 0; index < 5; index++ ) {
           int sum = arrayNumberA[index] + arrayNumberB[index];
           listOfNumbers = listOfNumbers  + "\n" + "A["+index+"]: " + arrayNumberA[index] + " + " + "B["+index+"]: " + arrayNumberB[index] + " = " + sum;
       }
       JOptionPane.showMessageDialog(null,"List of Numbers:\n"+listOfNumbers,
            "Message ",JOptionPane.INFORMATION_MESSAGE);
    }
}
