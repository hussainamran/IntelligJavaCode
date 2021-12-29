package com.syntax.class26.Homework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Students {
    /*
   Create a Set collection that will hold Objects of Student Type. In this set we do not care about the insertion order.
    Each student object should have name and studentID. Display name of each student.
    */
    String name;
    String studentID;
    Students(String name, String studentID){
        this.name=name;
        this.studentID=studentID;
    }
   void printName(){
       System.out.println(name);
   }
}
class Students1 {
    public static void main(String[] args) {
        HashSet<Students> students=new HashSet<>();
        students.add(new Students("John", "ab123"));
        students.add(new Students("Lubo","aq123"));
        students.add(new Students("Amran","we3121"));

        for(Students students1:students){
            students1.printName();
        }
    }
}