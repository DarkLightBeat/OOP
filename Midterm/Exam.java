import javax.swing.JOptionPane;

public class Midterm {
    public static void main(String[] args) {
        
        
        String firstName, lastName;
        
        JOptionPane.showMessageDialog(null, "Welcome to Java Bank!");
        
        firstName = JOptionPane.showInputDialog(null, "Enter first name: ").toUpperCase();
        lastName = JOptionPane.showInputDialog("Enter last name: ").toUpperCase();
        
        JOptionPane.showMessageDialog(null, "Welcome to Java Bank " + firstName + " " + lastName);
        
        Object[] options = {"Balance Inquiry", "Withdraw", "Deposit", "Exit"};
        Object[] pick = {"Select Transaction", "Exit"};
        
        int n = JOptionPane.showOptionDialog(null, "WHAT TO DO?", "BANK TRANSACTION", 
                JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, pick, pick[0]  );
        

        while (true) {
            if (n == 0){
            int z = JOptionPane.showOptionDialog(null, "WHAT TO DO?", "BANK TRANSACTION", 
                    JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options [0]);
            
            double balance = 100;
            double deposit;
            double newBalance = balance;
                    
            if (z == 0){
                
                JOptionPane.showMessageDialog(null, "ACOUNT NAME: " + firstName + " " + lastName + "\n" +
                        "BALANCE: " + balance);
                
                balance += newBalance;
                
                
            }  else if (z == 2){
                deposit = Double.parseDouble(JOptionPane.showInputDialog(null, "BALANCE: " + balance + " \n " +
                        "Enter amount to deposit: " ));
                
                newBalance = balance + deposit;
                
                JOptionPane.showMessageDialog(null, "Account Name: " + firstName + " " + lastName + "\n" +
                        "CURRENT BALANCE: " + String.format("%.2f", balance) + "\n" +
                        "AMOUNT DEPOSITED: " + String.format("%.2f", deposit) + "\n" +
                        "NEW BALANCED: " + String.format("%.2f", newBalance), "DEPOSIT", JOptionPane.INFORMATION_MESSAGE);
            } else if (z == 1) {
                String selection[] = new String[8];
                
                selection[0] = "100.00";
                selection[1] = "200.00";
                selection[2] = "500.00";
                selection[3] = "1000.00";
                selection[4] = "3000.00";
                selection[5] = "5000.00";
                selection[6] = "6000.00";
                selection[7] = "10000.00";
                selection[8] = "Other amount";
                
                Object select = JOptionPane.showInputDialog(null, "ACCOUNT NAME: " + firstName + " " + lastName + "\n" +
                        "BALANCED: " + String.format("%.2f", newBalance) + "\n" +
                        "AMOUNT TO WITHDRAW: ", "WITHDRAW",JOptionPane.QUESTION_MESSAGE, null, selection, selection[0]);
                
                if (select != null) {
                    if (select.equals("Other amount")) {
                        double withdraw = Double.parseDouble(JOptionPane.showInputDialog(null, "ACCOUNT NAME: " + firstName + " " + lastName + "\n" +
                                "BALANCED: " + String.format("%.2f", newBalance - deposit + "\n" +
                                "ENTER AMOUNT TO WITHDRAW: ")));
                    } else {
                        double withdraw = Double.parseDouble(select.toString());
                    }
                    
 
                }
                
                JOptionPane.showMessageDialog(null, select);
            } else {
                break;
            } 
                              
            } 
        }
        
    }
}
