package LinkedList_concept;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedLIstDemo {
    public static void main(String[] args) {

        LinkedList<String> ll= new LinkedList<String>();
        ll.add("AA");
        ll.add("BB");

        Iterator<String> iterator= ll.descendingIterator();

        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }

    }
}
