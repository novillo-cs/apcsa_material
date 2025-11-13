public class Student extends Person {
    private int grade;

    public Student(String fName, String lName, String addr, int gr) {
        super(fName, lName, addr);
        grade = gr;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int newInput) {
        grade = newInput;
    }
    
    // static methods are hidden, nor overridden
    public static void showClassInfo() {
        System.out.println("This is the Student class.");
    }
    
}
