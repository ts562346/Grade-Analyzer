/**
 * @Author: Tasneem Hoque
 * A class which stores records of students using their name
 * and grades.
 */
public class Record {
    String studentName;
    int grade;

    /**
     * Constructor sets name and grade
     * @param grade : int, grade of the student
     * @param studentName : String, student's name
     */
    public Record (String studentName, int grade) {
        this.studentName = studentName;
        this.grade = grade;
    }

    // getters and setters

    public String getStudentName () {
        return studentName;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
}
