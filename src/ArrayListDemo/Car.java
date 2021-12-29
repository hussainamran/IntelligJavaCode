package ArrayListDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class Car {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Honda");
        arrayList.add("Toyota");
        arrayList.add("Honda");

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));

        }
        for (String ar : arrayList) {
            System.out.print(ar+" ");
        }
        //System.out.println(arrayList);

        Iterator<String> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next()+" ");

        }
        int i=0;
        while (i<arrayList.size()){
            System.out.println(arrayList.get(i));
            i++;
        }
    }
}