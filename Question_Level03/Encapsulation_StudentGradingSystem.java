package Question_Level03;
//3. Student Grading System:
//Design a Student class with private fields: name, rollNumber, and marks (0 to 100).
//
//Write a setter for marks. If an invalid mark (e.g., -5 or 105) is passed, print "Invalid Marks" and set marks to 0.
//
//Create a method calculateGrade() that returns a String: "A" (>=90), "B" (>=75), "C" (>=50), or "Fail" (<50) based on the encapsulated marks.
public class Encapsulation_StudentGradingSystem {
    private String name ;
    private int rollNo;
    private int marks;
    public Encapsulation_StudentGradingSystem(String name , int rollNo){
        this.name = name;
        this.rollNo = rollNo;
    }

    public void setMarks(int value){
        if (value > 100 && value < 0) {

            System.out.println("Invalid marks" + marks);

        }
        else {
            marks = value;
            System.out.println("marks are valid" + marks);
        }
    }
    public String calculateGrade(){
        String a ="A";
        String b ="B";
        String c ="C";
        String f ="fail";
        if(marks >=90){
            System.out.println(a);
        } else if (marks >= 75) {
            System.out.println(b);
        } else if (marks >= 50){
            System.out.println(c);
        }else{
            System.out.println(f);
        }
        return f;
    }
    public void getMarks(){
        System.out.println(marks);
    }

    public static void main(String[] args) {
        Encapsulation_StudentGradingSystem Student = new Encapsulation_StudentGradingSystem("deevanshu",25);
        Student.setMarks(95);
        Student.calculateGrade();
        Student.getMarks();
    }
}
