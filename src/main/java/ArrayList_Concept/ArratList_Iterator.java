package ArrayList_Concept;

import java.util.*;

public class ArratList_Iterator {

    public static void main(String[] args) {

        ArrayList<String> arr = new ArrayList<String>();
        arr.add("AAA");
        arr.add("BBB");
        arr.add("CCC");
        arr.add("DDD");
        arr.add("EEE");
        System.out.println("-------By printing direct the arraylist-------");
        System.out.println(arr);

        System.out.println("-------By For Loop-------");
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));

        }

        System.out.println("-------By For Each Loop-------");
        for (String s : arr) {
            System.out.println(s);
        }
        System.out.println("-------By Iterator-------");
        Iterator<String> itr = arr.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }


    }
}
