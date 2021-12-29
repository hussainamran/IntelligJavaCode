package com.syntax.revireclass12;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class SetDemo4 {
    public static void main(String[] args) {
        LinkedHashSet<Person> person=new LinkedHashSet<>();
        person.add(new Person("Naia",17));
        person.add(new Person("Hasim",14));
        person.add(new Person("Aysha",13));

        long conut =person.stream().filter(p->p.name.contains("s")).count();
        System.out.println(conut);

       // List<String> collect=person.stream().filter(p->p.age>16).map(p->p.name).collect(Collectors.toList());
        //System.out.println(collect);

        List<String> collect=person.stream().filter(p->p.age<20).map(p->p.name).collect(Collectors.toList());
        System.out.println(collect);


    }
}
