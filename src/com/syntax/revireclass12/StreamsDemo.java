package com.syntax.revireclass12;

import java.util.ArrayList;

public class StreamsDemo {
    public static void main(String[] args) {
        ArrayList<Student>list=new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            list.add(new Student());
        }

      /*  long statrTime=System.currentTimeMillis();
        for (Student st:list){
            st.work();
        }
        long endTime=System.currentTimeMillis();
        System.out.println(endTime-statrTime);*/
        long startTime=System.currentTimeMillis();
        list.parallelStream().forEach(p-> p.work());
        long endTime=System.currentTimeMillis();
        System.out.println(endTime-startTime);




    }
}
