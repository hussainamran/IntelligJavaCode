package com.syntax.class28.Homework;

import java.util.Collection;
import java.util.TreeMap;

public class PersonTest {
    public static void main(String[] args) {

        TreeMap<Integer,Person> personTreeMap =new TreeMap<>();

        Person person=new Person("John","Smith",45,80000);
        Person person1=new Person("Rob","Smith",40,70000);
        Person person2=new Person("Rick","Will",33,97000);
        Person person3=new Person("Jason","Jason",67,60000);
        Person person4=new Person("Matt","Mal",23,640000);


       personTreeMap.put(1,person);
       personTreeMap.put(2,person1);
       personTreeMap.put(3,person2);
       personTreeMap.put(4,person3);
       personTreeMap.put(5,person4);
        Collection<Person>values= personTreeMap.values();
        for(Person value1:values){
            value1.printuserDetial();
        }

    }
}
