package institution;

import person.Student;

import java.util.ArrayList;

public class University {
    private String name;
    private ArrayList<Student> students = new ArrayList<>();

    public University(String name) {
        this.name = name;
    }

    public void setStudent(Student student) {
        //TODO: Implementation is needed
    }

    public void addStudent(Student student) {
        students.add(student);
    }
}