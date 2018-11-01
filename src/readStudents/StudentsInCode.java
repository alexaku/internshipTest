package readStudents;

import person.Student;
import person.consciousness.Knowledge;

import java.util.ArrayList;

public class StudentsInCode implements StudentRepository {

    @Override
    public ArrayList<Student> getStudents() {

        ArrayList<Student> students = new ArrayList<>();

        students.add( new Student("Andrew Kostenko", new Knowledge(28)));
        students.add( new Student("Julia Veselkina", new Knowledge(30)));
        students.add( new Student("Maria Perechrest", new Knowledge(30)));
        students.add( new Student("Alex Akulenko", new Knowledge(100)));
        students.add( new Student("Vlad Shtefan", new Knowledge(94)));
        students.add( new Student("Olena", new Knowledge(94)));
        students.add( new Student("Anton", new Knowledge(94)));
        students.add( new Student("Sasha", new Knowledge(94)));
        students.add( new Student("Oleh", new Knowledge(94)));
        students.add( new Student("Marta", new Knowledge(94)));

        students.get(9).setKnowledge(new Knowledge(50));

        return students;
    }
}
