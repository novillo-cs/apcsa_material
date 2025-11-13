public class Teacher extends Person {
    private String department;

    public Teacher(String fName, String lName, String addr, String dep) {
        super(fName, lName, addr);
        department = dep;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String newInput) {
        department = newInput;
    }

    public String toString() {
        return ("Hello Teacher " + super.getFirstName());
    }
}
