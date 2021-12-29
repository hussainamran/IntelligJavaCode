package com.syntax.groupProject.Task1;





public class ShapeTester {
    public static void main(String[] args) {

        Shape circle=new Circle1();
        circle.calculateArea(5);
        circle.calculatePerimeter(5);

        Shape[] shape={new Circle1(), new Square()};
        for(Shape shape1:shape){
            shape1.calculateArea(2.5);
            shape1.calculatePerimeter(17.5);
        }
    }

}
