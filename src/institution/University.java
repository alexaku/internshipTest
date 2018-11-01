package institution;

import person.Student;

import java.util.ArrayList;

public class University {
    private String name;
    private double averageMark;
    private ArrayList<Student> students = new ArrayList<>();

    public University(String name) {
        this.name = name;
    }

    public void setStudent(Student student) {
        //TODO: Implementation is needed
    }

    public void addStudent(Student student) {
        students.add(student);
        setAverageLevelOfKnowledge(this.name);
    }

    private void setAverageLevelOfKnowledge(String name) {
        double marksSum = 0;
        for (Student student : students) {
            marksSum += (double) (student.getKnowledge());
        }
        averageMark = (marksSum / students.size());
    }

    public double getAverageLevelOfKnowledge() {
        return averageMark;
    }
}