import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class salary {

    public static void main(String[] args) {

        deduction getOperator = new deduction();

        String input, name;
        int hoursWork;
        double earnHour, grossSalary, netSalarySSS, netSalaryPhilHealth, netSalaryPagibig, totalDeductions, netSalary;

        DecimalFormat df = new DecimalFormat("#,##0.00");

        name = JOptionPane.showInputDialog(null, "Enter employee name: ", "Employee Name", JOptionPane.QUESTION_MESSAGE);

        input = JOptionPane.showInputDialog("Enter amount earned per hour: ");
        earnHour = Double.parseDouble(input);

        input = JOptionPane.showInputDialog("Enter number of hours worked: ");
        hoursWork = Integer.parseInt(input);

        grossSalary = getOperator.getGrossSalary(earnHour, hoursWork);
        netSalarySSS = getOperator.getSSS(grossSalary);
        netSalaryPhilHealth = getOperator.getPhilHealth(grossSalary);
        netSalaryPagibig = getOperator.getPagibig(grossSalary);
        totalDeductions = getOperator.getTotalDeductions(netSalarySSS, netSalaryPhilHealth, netSalaryPagibig);
        netSalary = getOperator.getNetSalary(grossSalary, totalDeductions);

        JOptionPane.showMessageDialog(null, "EMPLOYEE SALARY INFORMATION: " + "\n\n" +
                "Name: " + name + "\n" +
                "Amount earned per hour: " + df.format(earnHour) + "\n" +
                "Number of hours worked: " + hoursWork + "\n\n" +
                "DEDUCATIONS:" + "\n\n" +
                "Gross Salary: " + df.format(grossSalary) + "\n" +
                "SSS Deduction: " + df.format(netSalarySSS) + "\n" +
                "PhilHealth Deduction: " + df.format(netSalaryPhilHealth) + "\n" +
                "Pagibig Deduction: " + df.format(netSalaryPagibig) + "\n\n" +
                "Total Deductions: " + df.format(totalDeductions) + "\n" +
                "Net Salary: " + df.format(netSalary), "Salary", JOptionPane.INFORMATION_MESSAGE);
    }
}

public class deduction {
    double getGrossSalary(double earnHour, double hoursWork){
        double grossSalary = earnHour * hoursWork;
        return grossSalary;
    }

    double getSSS(double grossSalary){
        double netSalarySSS = grossSalary * 0.14;
        return netSalarySSS;
    }

    double getPhilHealth(double grossSalary){
        double netSalaryPhilHealth = grossSalary * 0.05;
        return netSalaryPhilHealth;
    }

    double getPagibig(double grossSalary){   
        double netSalaryPagibig = grossSalary * 0.02;
        return netSalaryPagibig;
    }

    double getTotalDeductions(double netSalarySSS, double netSalaryPhilHealth, double netSalaryPagibig){
        double totalDeductions = netSalarySSS + netSalaryPhilHealth + netSalaryPagibig;
        return totalDeductions;
    }

    double getNetSalary(double grossSalary, double totalDeductions){
        double netSalary = grossSalary - totalDeductions;
        return netSalary;
    }
}
