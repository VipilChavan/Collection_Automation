package ArrayList_Concept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class ArrayList_RemoveDuplicates {

    public static void main(String[] args) {

        ArrayList<Integer> arr1= new ArrayList<Integer>(Arrays.asList(1,1,5,6,8,7,2,5,2,6,8,7,3,3,4,9,4,9));
        System.out.println(arr1);
        System.out.println("********************************");
        LinkedHashSet<Integer> linkedHashSet= new LinkedHashSet<Integer>(arr1);//as set dont have duplicates but not acc to sorting order
        System.out.println(linkedHashSet);
        System.out.println("********************************");
        ArrayList<Integer> arr2= new ArrayList<>(linkedHashSet);
        System.out.println(arr2);




    }
}
