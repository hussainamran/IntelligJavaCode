package com.syntax.revireclass12;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class SetDemo3 {
    public static void main(String[] args) {
        LinkedHashSet<Person> person = new LinkedHashSet<>();
        person.add(new Person("Naia", 16));
        person.add(new Person("Hasim", 22));
        person.add(new Person("Aysha", 13));
        person.add(new Person("Alexey", 34));

        System.out.println(new Person("Naia",16));
        person.remove(new Person("Naia",16));
        System.out.println(person);

        person.removeIf(p-> p.name.toLowerCase().contains("h"));

        person.forEach(p-> System.out.println(p));// print all the elements one by one



    }

}
