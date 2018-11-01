package institution.interlink;

import institution.University;
import person.Student;

import java.util.ArrayList;

public class Internship {
    private String name;
    private ArrayList<Student> students = new ArrayList<>();
    private ArrayList<University> universities = new ArrayList<>();

    public Internship(String name) {
        this.name = name;
    }

    public void setStudent(Student student, University university) {
        if ( !(universities.contains(university)) ) {
            universities.add(university);
        }
        students.add(student);
    }

    public String getStudents() {
        //TODO: Implementation is needed
        return "Andrew Maslenko\nJulia Veselkina\n";
    }
}