package ArrayList_Concept;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class ArrayList_Synchronization {
    /*
    Q1. Difference Between Synchronized Arraylist and Non Synchronized Arraylist
    Q2. Is Arraylist Synchronized or ThreadSafe--- NO it's not Synchronized or ThreadSafe
    Q3. ArrayList can be Synchronized --Yes
    Q4. How to synchronize ArrayList in Java
    Ans -- 1. Collections method ie
        Collections.synchronizedList() it is a method, and it returns synchronized List
        2. CopyOnWriteArrayList is a class which also return threadsafe variant of ArrayList

    Q5. Difference Between Collections.synchronizedList() and CopyOnWriteArrayList
    Ans--for traverse operation we have to use explicit synchronization for Collections.synchronizedList()
        for any operation we don't have to use explicitly synchronization for CopyOnWriteArrayList

    */

    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        List<Integer> list_syn= Collections.synchronizedList(arr);

        System.out.println(list_syn);
        list_syn.add(11); //for add and remove we don't need to use explicit synchronization for Collections.synchronizedList()
        list_syn.add(12);
        list_syn.add(13);
        System.out.println(list_syn);

//        for traverse operation we have to use explicit synchronization for Collections.synchronizedList()
        for (int i = 0; i < list_syn.size(); i++) {
            System.out.println(list_syn.get(i));

        }
        System.out.println("*************************");
        synchronized (list_syn){
            Iterator<Integer> itr= list_syn.iterator();
            while (itr.hasNext())
            {
                System.out.println(itr.next());
            }

        }
        System.out.println("*************************");

        CopyOnWriteArrayList<Integer> list= new CopyOnWriteArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8));

//        for any operation we don't have to use explicitly synchronization for CopyOnWriteArrayList


        System.out.println(list);

        Iterator<Integer> itr= list.iterator();
        while (itr.hasNext())
        {
            System.out.println(itr.next());
        }



    }


}
