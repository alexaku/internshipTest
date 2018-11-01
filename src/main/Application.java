package main;

import institution.University;
import institution.interlink.Internship;
import person.Student;
import person.consciousness.Knowledge;

public class Application {
    public static void main(String[] args) {
        University university = new University("CH.U.I.");

        university.addStudent(new Student("Andrew Kostenko", new Knowledge(98)));
        university.addStudent(new Student("Julia Veselkina", new Knowledge(54)));
        university.addStudent(new Student("Maria Perechrest", new Knowledge(51)));

        Internship internship = new Internship("Interlink");

        internship.setStudent(new Student("Andrew Kostenko", new Knowledge(98)), university);
        internship.setStudent(new Student("Julia Veselkina", new Knowledge(54)), university);
        internship.setStudent(new Student("Maria Perechrest", new Knowledge(51)), university);

        System.out.println(university.getAverageLevelOfKnowledge());
        System.out.println("List of internship's students:");
        System.out.println(internship.getStudents());
    }
}