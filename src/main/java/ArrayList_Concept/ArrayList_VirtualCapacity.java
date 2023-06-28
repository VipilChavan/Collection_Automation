package ArrayList_Concept;

import java.util.ArrayList;

public class ArrayList_VirtualCapacity {

    public static void main(String[] args) {

        /*
        Virtual Capacity/Initial Capacity is 10
        new capacity =(current capacity*3/2)+1
        exmaple= { (10*3/2)=1 }=16

        Physical Capacity is 0 when we create an arraylist but Virtual capacity is 10
        which we cant see on console,internally the size of arraylist is 0
        when we print the size of arraylist we will we get 0

        if we add some elements in arraylist we will get the current Physical Capacity
        We can declare the arraylist with customized size
        */

        ArrayList<Object> ar = new ArrayList<Object>();

        System.out.println(ar.size());//Physical Capacity is 0
        ar.add(100);
        System.out.println(ar.size());//Physical Capacity is 1
        ar.add(200);
        ar.add("VVV");
        ar.add(600);
        System.out.println(ar.size());//Physical Capacity is 4

        ArrayList<Object> arCustom = new ArrayList<Object>(20);
        System.out.println(arCustom.size());//We can declare the arraylist with customized size but we cant see on console


    }
}
