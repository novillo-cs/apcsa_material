import java.util.ArrayList;

public class Driver {

    public static void main(String[] args) {

        Person myPerson = new Person("Tyler", "Davis", "45 34th St.");
        Student myStudent = new Student("Emma", "Smith", "5 3rd Ave.", 11);
        Teacher myTeacher = new Teacher("Mary", "Anderson", "100 33rd St.", "CS");
        UnderGrad myUnderGrad = new UnderGrad("Sophie", "Adams", "21-20 43rd St.", 100, true);
        ArrayList<Person> myList = new ArrayList<Person>();
        myList.add(myPerson);
        myList.add(myStudent);
        myList.add(myTeacher);
        myList.add(myUnderGrad);
        for (Person p : myList) {
            System.out.println("Hello " + p.getFirstName());
        }

        /**
         * With the student, we have access to methods from the
         * Person class and the Student class.
         */

        System.out.println("Student Name: " + myStudent.getFirstName());
        System.out.println("Grade: " + myStudent.getGrade());

        /**
         * With the teacher, we have access to methods from the
         * Person class and the Teacher class.
         */

        System.out.println("Teacher Name: " + myTeacher.getFirstName());
        System.out.println("Department: " + myTeacher.getDepartment());

        /**
         * With the person, we only have access to methods from
         * the Person class.
         */

        System.out.println("Person Name: " + myPerson.getFirstName());

        /**
         * toString()
         * It was overridden only in UnderGrad and Teacher
         */
        for (Person p : myList) {
            System.out.println(p);
        }
        
        /**
         * Calling static methods
         * the Person class.
         */

        myPerson.showClassInfo();
        myStudent.showClassInfo();
        myTeacher.showClassInfo();
        

    }
}
