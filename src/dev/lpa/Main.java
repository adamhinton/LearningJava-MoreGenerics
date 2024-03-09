package dev.lpa;

import dev.lpa.model.LPAStudent;
import dev.lpa.model.Student;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        int studentCount = 10;
        List<Student> students = new ArrayList<>();
        for(int i=0; i<studentCount; i++){
            students.add(new Student());
        }
        students.add(new LPAStudent());
        printMoreLists(students);

        List<LPAStudent> lpaStudents = new ArrayList<>();
        for(int i=0; i<studentCount; i++){
            lpaStudents.add(new LPAStudent());
        }
        printMoreLists(lpaStudents);


    }

    public static void printMoreLists(List<? extends Student> students){
        for (var student : students){
            System.out.println(student.getYearStarted() + ": " + student);
        }
    }
//    public static <T extends Student> void printList(List<T> students){
//        for (var student : students){
//            System.out.println(student.getYearStarted() + ": " + student);
//        }
//    }

}