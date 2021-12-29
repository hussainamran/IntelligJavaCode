package com.syntax.groupProject.Task1;

 interface Shape {
    /*
    Create an Interface 'Shape' with undefined methods as calculateArea and calculatePerimiter.
    Create 2 classes Circle & Square that implements functionality defined in the Shape Interface. Test your code.
     */
    void calculateArea(double a);
    void calculatePerimeter(double a);
}
class Circle1 implements Shape {
    @Override
    public void calculateArea(double radius) {
        System.out.println("The area of circle is: " + (change(Math.PI * Math.pow(radius, 2), 2)));
    }

    @Override
    public void calculatePerimeter(double radius) {
        System.out.println("The perimeter of circle is: " +(change (2 * Math.PI * radius,2)));
    }

    static double change(double value, int decimalpoint) {
        value = value * Math.pow(10, decimalpoint);
        value = Math.floor(value);
        value = value / Math.pow(10, decimalpoint);
        System.out.println(value);
        return value;
    }
}

    class Square implements Shape {

        @Override
        public void calculateArea(double length) {
            System.out.println("The area of square is : " + (change(length * length, 2)));
        }

        @Override
        public void calculatePerimeter(double length) {
            System.out.println("The area of perimeter is : " + (change(4 * length, 2)));
        }

        static double change(double value, int decimalpoint) {
            value = value * Math.pow(10, decimalpoint);
            value = Math.floor(value);
            value = value / Math.pow(10, decimalpoint);
            System.out.println(value);
            return value;
        }
    }



