package ArrayList_Concept;

import java.util.ArrayList;
import java.util.Objects;

public class ArrayList_Demo {
    public static void main(String[] args) {

        /*
        Default Class
        arraylist is dynamic array
        insertion order is preserved
        duplicates are allowed
        heterogeneous object is allowed
        Null Insertion is allowed
        Implements Random Access
        Virtual Capacity/Initial Capacity is 10
        new capacity =(current capacity*3/2)+1
        exmaple= { (10*3/2)=1 }=16
        In collection we add only Object type of data not primitive type
        */


        //use generics
        ArrayList<Object> ar = new ArrayList<Object>();
        ar.add(100);
        ar.add(200);
        ar.add(200);//Duplicates are allowed
        ar.add("Vipil");
        ar.add("aaa");
        ar.add(true);
        ar.add(null);
        ar.add(new Object());

        System.out.println(ar.size());
        System.out.println(ar);
        System.out.println(ar.get(0));
        System.out.println(ar.get(3));
        System.out.println(ar.get(5));
        ar.set(0,500);
        System.out.println(ar.get(0));
        ar.remove(6);
        System.out.println(ar);




    }
}
