import javax.swing.JOptionPane;

public class Constructor {

    public static void main(String[] args) {
        
        String input, name;
        int hoursWork;
        double earnHour;

        name = JOptionPane.showInputDialog(null, "Enter employee name: ", "Employee Name", JOptionPane.QUESTION_MESSAGE);

        input = JOptionPane.showInputDialog("Enter amount earned per hour: ");
        earnHour = Double.parseDouble(input);

        input = JOptionPane.showInputDialog("Enter number of hours worked: ");
        hoursWork = Integer.parseInt(input);
        
        Methods constructor = new Methods(earnHour, hoursWork);
  

        JOptionPane.showMessageDialog(null, "EMPLOYEE SALARY INFORMATION: " + "\n\n" +
                "Name: " + name + "\n" +
                "Amount earned per hour: â‚±" + String.format("%.2f", earnHour) + "\n" +
                "Number of hours worked: " + hoursWork + "\n\n" +
                "DEDUCATIONS:" + "\n\n" +
                "Gross Salary: â‚±" + String.format("%.2f", constructor.getGrossSalary()) + "\n" +
                "SSS Deduction: â‚±" + String.format("%.2f", constructor.getNetSalarySSS()) + "\n" +
                "PhilHealth Deduction: â‚±" + String.format("%.2f", constructor.getNetSalaryPhilHealth()) + "\n" +
                "Pagibig Deduction: â‚±" + String.format("%.2f", constructor.getNetSalaryPagibig()) + "\n\n" +
                "Total Deductions: â‚±" + String.format("%.2f", constructor.getTotalDeductions()) + "\n" +
                "Net Salary: â‚±" + String.format("%.2f", constructor.getNetSalary()), "Salary", JOptionPane.INFORMATION_MESSAGE);
    }
}

public class Methods {
    double salarySSS, salaryPhilhealth, salaryPagibig, netSalarySSS, netSalaryPhilHealth, netSalaryPagibig, grossSalary, totalDeductions, netSalary;

    public Methods(double earnHour, double hoursWork) {
        salarySSS = 0.14;
        salaryPhilhealth = 0.05;
        salaryPagibig = 0.02;

        grossSalary = earnHour * hoursWork;
        netSalarySSS = grossSalary * salarySSS;
        netSalaryPhilHealth = grossSalary * salaryPhilhealth;
        netSalaryPagibig = grossSalary * salaryPagibig;

        totalDeductions = netSalarySSS + netSalaryPhilHealth + netSalaryPagibig;
        netSalary = grossSalary - totalDeductions;
    }

    double getGrossSalary() {
        return grossSalary;
    }

    double getNetSalarySSS() {
        return netSalarySSS;
    }

    double getNetSalaryPhilHealth() {
        return netSalaryPhilHealth;
    }

    double getNetSalaryPagibig() {
        return netSalaryPagibig;
    }

    double getTotalDeductions() {
        return totalDeductions;
    }

    double getNetSalary() {
        return netSalary;
    }
}
