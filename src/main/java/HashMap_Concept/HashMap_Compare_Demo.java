package HashMap_Concept;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class HashMap_Compare_Demo {

    public static void main(String[] args) {
        HashMap<Integer,String> h1 = new HashMap<>();
        h1.put(1,"A");
        h1.put(2,"B");
        h1.put(3,"C");
        h1.put(4,"D");

        HashMap<Integer,String> h2 = new HashMap<>();
        h1.put(1,"A");
        h1.put(2,"B");
        h1.put(3,"C");
        h1.put(4,"D");

        HashMap<Integer,String> h3 = new HashMap<>();
        h1.put(1,"A");
        h1.put(2,"B");
        h1.put(3,"C");
        h1.put(4,"C");




        //compare on the basis of values only
        System.out.println("**********");

//        duplicates are not allowed : using arraylist(in array list duplicates are allowed)
        ArrayList<String> al_1 = new ArrayList<String>(h1.values());//A,B,C,D
        ArrayList<String> al_2 = new ArrayList<String>(h2.values());//A,B,C,D
        ArrayList<String> al_3 = new ArrayList<String>(h3.values());//A,B,C,C

        System.out.println(al_1);
        System.out.println(al_2);
        System.out.println(al_3);
        System.out.println("**********");
        System.out.println(al_1.equals(al_2));//TRUE
        System.out.println(al_1.equals(al_3));//FALSE
//
//        // duplicates are allowed
//        HashSet<String> set3 = new HashSet<String>(h1.values());//A,B,C,D
//        HashSet<String> set4= new HashSet<String>(h2.values());//A,B,C,D
//        HashSet<String> set5 = new HashSet<String>(h3.values());//A,B,C //ONE C WILL NOT BE ALLOWED AS IT IS DUPLICATE
//        System.out.println("**********");
//        System.out.println(set3);
//        System.out.println(set4);
//        System.out.println(set5);
//        System.out.println("**********");
//        System.out.println(set3.equals(set4));//TRUE
//        System.out.println(set3.equals(set5));//FALSE
//
//


    }
}
