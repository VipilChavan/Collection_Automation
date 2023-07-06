package HashMap_Concept;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class HashMap_Compare {

    public static void main(String[] args) {
        HashMap<Integer,String> h1 = new HashMap<Integer,String>();
        h1.put(1,"A");
        h1.put(2,"B");
        h1.put(3,"C");
        h1.put(4,"D");

        HashMap<Integer,String> h2 = new HashMap<Integer,String>();
        h2.put(1,"A");
        h2.put(2,"B");
        h2.put(3,"C");
        h2.put(4,"D");

        HashMap<Integer,String> h3 = new HashMap<Integer,String>();
        h3.put(1,"A");
        h3.put(2,"B");
        h3.put(3,"C");
        h3.put(5,"D");

        HashMap<Integer,String> h4 = new HashMap<Integer,String>();
        h4.put(1,"AF");
        h4.put(2,"BF");
        h4.put(3,"CF");
        h4.put(4,"DF");

        HashMap<Integer,String> h5 = new HashMap<Integer,String>();
        h1.put(1,"A");
        h1.put(2,"B");
        h1.put(3,"C");
        h1.put(4,"C");

        //COMPARE ON THE BASIS OF KEY-VALUE PAIR : use equals method
//
//        System.out.println(h1.entrySet().equals(h2.entrySet()));
//        System.out.println(h1.equals(h2));
//        System.out.println("**********");
//        System.out.println(h1.equals(h3));
//        System.out.println(h1.entrySet().equals(h3.entrySet()));

//        compare on the basis of key only : use keySet();
//        System.out.println("**********");
//        System.out.println(h1.keySet().equals(h2.keySet()));
//        System.out.println(h1.keySet().equals(h3.keySet()));
//        System.out.println(h1.keySet().equals(h4.keySet()));
//
//


//        find the extra key between map
//        combine the keys from both the maps
        System.out.println("**********");
//        HashSet<Integer> set1= new HashSet<Integer>(h1.keySet());
//        HashSet<Integer> set2= new HashSet<Integer>(h3.keySet());
//
////        System.out.println(set1.retainAll(set2));
//        System.out.println("Before adding "+set1);
//        System.out.println("Before adding "+set2);
//        set1.addAll(set2);
//        System.out.println("After adding set2 in set1 "+set1);
//        set1.removeAll(set2);
//        System.out.println(set1);
////
//                                     //*****OR*****//
//        HashSet<Integer> set1= new HashSet<Integer>(h1.keySet());
//        set1.addAll(h3.keySet());
////        set1.removeAll(h1.keySet());
//        set1.removeAll(h3.keySet());
//        System.out.println(set1);


        //compare on the basis of values only
        System.out.println("**********");

//        duplicates are not allowed : using arraylist(in array list duplicates are allowed)
        ArrayList<String> al_1 = new ArrayList<String>(h1.values());//A,B,C,D
        ArrayList<String> al_2 = new ArrayList<String>(h5.values());//A,B,C,C
        ArrayList<String> al_3 = new ArrayList<String>(h2.values());//A,B,C,D

        System.out.println(al_1);
        System.out.println(al_2);
        System.out.println(al_3);
        System.out.println("**********");
        System.out.println(al_1.equals(al_2));//false
        System.out.println(al_1.equals(al_3));//true

        // duplicates are allowed
        HashSet<String> set3 = new HashSet<String>(h1.values());//A,B,C,D
        HashSet<String> set4= new HashSet<String>(h2.values());//A,B,C
        HashSet<String> set5 = new HashSet<String>(h5.values());//A,B,C,D
        System.out.println("**********");
        System.out.println(set3);
        System.out.println(set4);
        System.out.println(set5);
        System.out.println("**********");
        System.out.println(set3.equals(set4));//false
        System.out.println(set3.equals(set5));//true









    }
}
