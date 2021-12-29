package com.syntax.class28.Homework;

import javax.swing.text.View;
import java.util.*;
import java.util.stream.Collectors;

public class Task3 {
    public static void main(String[] args) {
        /*
       Create a Map that will store Employee name and salary. Write a logic to retrieve an employee who gets the highest salary.
       Output should be in the below format John Smith=$100000
         */
        HashMap<String, Integer> employee = new HashMap<>();
        employee.put("Rick Corner", 40000);
        employee.put("Tom Lobby", 67000);
        employee.put("Robert Nelson", 80000);
        employee.put("Shane Rod", 78000);
        employee.put("Will Smith", 97000);
        Iterator<Integer> iterator = employee.values().iterator();
        Integer highestSalary = 0;
        while (iterator.hasNext()) {
            Integer salary = iterator.next();
            if (salary > highestSalary) {
                highestSalary = salary;
            }
        }
        Set<Map.Entry<String, Integer>> values = employee.entrySet();
        for (Map.Entry<String, Integer> entry : values) {
            if (entry.getValue() == highestSalary) {
                System.out.println(entry.getKey() + "=$" + entry.getValue());
            }
        }

    }
}