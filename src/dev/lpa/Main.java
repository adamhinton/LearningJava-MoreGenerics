package dev.lpa;

import dev.lpa.model.LPAStudent;
import dev.lpa.model.Student;
import dev.lpa.util.QueryList;

import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {


//        List<LPAStudent> lpaStudents = new ArrayList<>();

        QueryList<LPAStudent> queryList = new QueryList<>();
        for(int i=0; i<25; i++){
            queryList.add(new LPAStudent());
        }

        System.out.println("Ordered:");
        queryList.sort(Comparator.naturalOrder());
        printList(queryList);

        System.out.println("Matches");
        var matches=  queryList.getMatches("PERCENTCOMPLETE", "50").getMatches("COURSE", "Python");

        printList(matches);
    }

    public static void printList(List<?> students){
        for(var student : students){
            System.out.println(student);
        }
    }


    public static void printMoreLists(List<? extends Student> students){

        for (var student : students){
            System.out.println(student);
        }
    }


    public static void testList(List<?>  list){

        for (var element: list){
            if(element instanceof String s){
                System.out.println("String: " + s.toUpperCase());
            }

            else if(element instanceof Integer i){
                System.out.println("Integer: " + i.floatValue());
            }

        }
    }
}


//Challenge notes
// Do the following:

// Make QL extend ArrayList, removing items field
// Add student id field to Student
    // implement way to compare Students, so students are naturally ordered by student id
    // Impl one other way to compare Students by course or year, or by percent complete for LPA students

// override matchFieldValue on LPASTudent, so that you return students, not matched on percent complete equal to a
// value, but on percent less than / equal to a submitted value.
    // Note: LPAStudent should be searchable by same fields as Student.

// Main:
    // Run code on 25 random students
    // Select students who are <=50% finished
    // Print out that ^ list, sorted in at least two ways
            //first by using List.sort with Comparator.naturalOrder()
            // Then using our own Comparator
            // i.e. first by studentid, then some other way we've selected.