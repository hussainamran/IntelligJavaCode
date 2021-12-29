package com.syntax.groupProject.Task1.task2;

import com.syntax.groupProject.Task1.MathUtil;

public abstract class Marks {
    double marks1;
    double marks2;
    double marks3;
    Marks(double marks1, double marks2, double marks3){
        this.marks1=marks1;
        this.marks2=marks2;
        this.marks3=marks3;

    }
      /*
    We have to calculate the average of marks obtained in three subjects by student A and by student B.
    Create class 'Marks' with an abstract method 'getPercentage' that will be returning the average percentage of marks.
    Provide implementation of abstract method in classes 'A' and 'B'. The constructor of student A takes the marks
    in three subjects as its parameters and the marks in four subjects as its parameters for student B. Test your code
     */

    abstract double getPercentage();
}

class A extends Marks {

    A(double marks1, double marks2, double marks3) {
       super(marks1,marks2,marks3);
    }

     double getPercentage() {
        return MathUtil.round((marks1+marks2+marks3)/3,2);

    }
}

class B extends Marks{

    double marks4;
    B(double marks1,double marks2, double marks3, double marks4) {
        super(marks1,marks2,marks3);
        this.marks4=marks4;
    }
    double getPercentage() {
        return  MathUtil.round((marks1+marks2+marks3+marks4)/4,2);

    }

}


