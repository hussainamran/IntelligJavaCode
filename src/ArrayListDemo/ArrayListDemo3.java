package ArrayListDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo3 {
    public static void main(String[] args)
    {
        ArrayList<Integer> evennumbers =new ArrayList<>();
        for (int i = 2; i <=500 ; i=i+2) {
          evennumbers.add(i);
        }
        System.out.println(evennumbers);

        Iterator<Integer>iterator=evennumbers.iterator();
       while (iterator.hasNext()){
           Integer number=iterator.next();
           if(number % 5==0){
               iterator.remove();
           }

       }
        System.out.println(evennumbers);
    }

        }




