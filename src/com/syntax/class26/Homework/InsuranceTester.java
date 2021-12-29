package com.syntax.class26.Homework;

import java.util.ArrayList;
import java.util.Iterator;

public class InsuranceTester {
    public static void main(String[] args) {
        ArrayList<Insurance>insurance=new ArrayList<>();
        insurance.add(new Car("Toyots","Geico"));
        insurance.add(new Pet("Dog","Geico"));
        insurance.add(new Health("Geico"));


        for(int i=0; i<insurance.size(); i++){
            insurance.get(i).getQuote();
            insurance.get(i).cancelInsurance();
        }
        for(Insurance in:insurance){
            in.getQuote();
            in.cancelInsurance();
        }
        Iterator<Insurance> iterator=insurance.iterator();
        while (iterator.hasNext()){
            Insurance element=iterator.next();
            element.getQuote();
            element.cancelInsurance();
        }

    }
}
