package ArrayListDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo2 {
    public static void main(String[] args) {
        ArrayList<String>arrayList=new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("mango");
        arrayList.add("Sun");

        for (int i = 0; i < arrayList.size(); i++) {
            if(arrayList.get(i).toLowerCase().replaceAll("[easdA]","").length()<arrayList.get(i).length()){
                arrayList.set(i,"water");
            }

        }
        System.out.println(arrayList);
    }

}
