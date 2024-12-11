import java.util.ArrayList;
import java.util.Collections;

public class StudentArrayList {

    ArrayList<String> students = new ArrayList<>();
    // Add code to perform the required operations

    public StudentArrayList() {

        students.add("John");
        students.add("Jane");
        students.add("Bob");
        students.add("Mary");
        students.add("Jack");

    }

    public void removeStudents(int studentIndex) {
        students.remove(studentIndex);
    }

    public void cycleStudents() {
        for(String student : students) {
            System.out.println(student);
        }
    }

    public void sortList() {
        Collections.sort(students);
        System.out.println(students);
    }

}
