import javax.swing.JOptionPane;
public class DialogBox {
    public static void main(String[] args) {
        
        String grades, selectedStudents, message, passed, failed, invalid;
        double grade;
        int index;
        String students[] = new String[] {"Student 1", "Student 2", "Student 3", "Student 4", "Student 5"};
        String studentGrades [][] = new String[students.length][2];        
        
        for(index = 0; index < students.length; index++ ){
            studentGrades[index][0] = students[index];
            studentGrades[index][1] = "";
        }
        
        while (true) {
            selectedStudents = (String) JOptionPane.showInputDialog(null, "Select a student", "STUDENT GRADES", JOptionPane.QUESTION_MESSAGE,
                    null, students,students[0]);
            if(selectedStudents == null) {
                break;
            }
            
            grades = JOptionPane.showInputDialog("Enter grade: " + selectedStudents + ":");
            if(grades == null){
                continue;
            }
            
            index = getIndex(selectedStudents, students);
            if(index != -1){
                studentGrades[index][1] = grades;
            }
        }
        
        message = "Student Grades\n";
        passed = "PASSED\n";
        failed = "FAILED\n";
        invalid = "INVALID\n";
        
        for(String[] studentGrade : studentGrades){
            message += studentGrade[0] + ": " + studentGrade[1] + "\n";
            try {
                grade = Double.parseDouble(studentGrade[1]);
                if(grade >= 75) {
                    passed += studentGrade[0] + "\n";
                } else {
                    failed += studentGrade[0] + "\n";
                }
            } catch(NumberFormatException e) {
                invalid += studentGrade[0] + "\n";    
            }
        }
        JOptionPane.showMessageDialog(null, message + "\n" + passed + "\n" + failed + "\n" + invalid, "STUDENT GRADES", JOptionPane.INFORMATION_MESSAGE);
    }

    public static int getIndex(String student, String[] students) {
        for(int index = 0; index < students.length; index++) {
            if(students[index].equals(student)) {
                return index;
            }
        }
        return -1;
    }
}
