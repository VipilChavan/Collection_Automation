package ArrayList_Concept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayList_Compare {
    public static void main(String[] args) {

        //sort and compare/equals
        ArrayList<Integer> arr1= new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7));
        ArrayList<Integer> arr2= new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,8));
        ArrayList<Integer> arr3= new ArrayList<Integer>(Arrays.asList(1,6,5,4,3,2,7));

        Collections.sort(arr1);
        Collections.sort(arr2);
        Collections.sort(arr3);
        System.out.println(arr3);

        System.out.println(arr1.equals(arr2));
        System.out.println(arr1.equals(arr3));



        //2. compare two list - find out the additional elements:
        ArrayList<Integer> arr4= new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,8));
        ArrayList<Integer> arr5= new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7));

        //find the num which is not present in arr4

//        arr5.removeAll(arr4);
//        System.out.println(arr5); //7 is not present in arr4

        //which element is additional in arr4

        arr4.removeAll(arr5);
        System.out.println(arr4);//8 is additional in arr4

        //3.Find Common elements


        ArrayList<Integer> arr6= new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,8));
        ArrayList<Integer> arr7= new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7));

        arr6.retainAll(arr7);
        System.out.println(arr6);
    }
}
