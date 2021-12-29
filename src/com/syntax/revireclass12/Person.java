package com.syntax.revireclass12;

import java.util.Objects;

public class Person {
    String name;
    int age;
    public Person(String name, int age){
        this.name=name;
        this.age=age;

    }
    /*
    To print the fields of an object
     */

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    /*
    Need to override this method to work collections
     */

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
