
public class Student {

    private int studentId;
    private String name;
    private String department;
    private int marks;
    private double gpa;
    private String status;

    public Student(int studentId, String name, String department,
            int marks, double gpa, String status) {

        this.studentId = studentId;
        this.name = name;
        this.department = department;
        this.marks = marks;
        this.gpa = gpa;
        this.status = status;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public int getMarks() {
        return marks;
    }

    public double getGpa() {
        return gpa;
    }

    public String getStatus() {
        return status;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
