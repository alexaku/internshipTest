package main;

import institution.University;
import institution.interlink.Internship;
import readStudents.StudentRepository;
import readStudents.StudentsInCode;

public class Application {
    public static void main(String[] args) {
        
        University university = new University("CH.U.I.");

        StudentRepository listOfStudents = new StudentsInCode();


        university.addStudent(listOfStudents.getStudents().get(0));
        university.addStudent(listOfStudents.getStudents().get(1));
        university.addStudent(listOfStudents.getStudents().get(2));
        university.addStudent(listOfStudents.getStudents().get(9));
        university.addStudent(listOfStudents.getStudents().get(3));
        university.addStudent(listOfStudents.getStudents().get(4));
        university.addStudent(listOfStudents.getStudents().get(5));
        university.addStudent(listOfStudents.getStudents().get(6));
        university.addStudent(listOfStudents.getStudents().get(7));
        university.addStudent(listOfStudents.getStudents().get(8));

        Internship internship = new Internship("Interlink");

        internship.setStudent(listOfStudents.getStudents().get(0), university);
        internship.setStudent(listOfStudents.getStudents().get(1), university);
        internship.setStudent(listOfStudents.getStudents().get(2), university);
        internship.setStudent(listOfStudents.getStudents().get(3), university);
        internship.setStudent(listOfStudents.getStudents().get(4), university);

        university.addStudent(listOfStudents.getStudents().get(9));

        internship.setStudent(listOfStudents.getStudents().get(5), university);
        internship.setStudent(listOfStudents.getStudents().get(6), university);
        internship.setStudent(listOfStudents.getStudents().get(7), university);
        internship.setStudent(listOfStudents.getStudents().get(8), university);
        internship.setStudent(listOfStudents.getStudents().get(9), university);

        System.out.println("List of internship's students:");
        System.out.println(internship.getStudents());
    }
}