package com.syntax.class28.Homework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Jaba {
    public static void main(String[] args) {
        HashMap<String, Integer> employee = new HashMap<>();
        employee.put("Rick Corner", 40000);
        employee.put("Tom Lobby", 67000);
        employee.put("Robert Nelson", 80000);
        employee.put("Shane Rod", 78000);
        employee.put("Will Smith", 97000);
        Iterator<Integer> iterator = employee.values().iterator();
        Integer lowestSalary = 0;
        while (iterator.hasNext()){
            Integer salary=iterator.next();
            if (salary<lowestSalary){
                lowestSalary=salary;
            }
        }
        Set<Map.Entry<String,Integer>>value=employee.entrySet();
        for(Map.Entry<String,Integer>element:value){
            if(element.getValue()==lowestSalary){
                System.out.println(element.getKey()+"="+element.getValue());
            }
        }
    }
}
