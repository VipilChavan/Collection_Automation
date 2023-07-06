package HashMap_Concept;

import java.util.*;

public class HashMap_Demo {

    public static void main(String[] args) {
        HashMap<String, String> h1 = new HashMap<String, String>();

        h1.put("Vipil", "Chavan");
        h1.put("Komal", "Chavan");
        h1.put("Amu", "Chavan");
        h1.put("Shruti", "Chavan");
        h1.put("Divya", "Chavan");
        h1.put("null", "Chavan");
        h1.put("chavan", "null");
        h1.put("chavan1", "null");

        System.out.println(h1.get("Vipil"));
        System.out.println(h1.get("Amu"));
        System.out.println(h1.get("null"));
        System.out.println(h1.get("chavan"));
        System.out.println(h1.get("chavan1"));
        System.out.println("*************************************");

//        iterate hashmap
//        by using set.keySet which returns set and stores only key object as key are not duplicate neither set

        Iterator<String> itr = h1.keySet().iterator();
        while (itr.hasNext()) {
            String key = itr.next();
            String value = h1.get(key);
            System.out.println("Key =" + key + "  Value = " + value);

        }
        System.out.println("*************************************");

//         to get only values from the map
//
        ArrayList<String> al = new ArrayList<String>(h1.values());

        for (int i = 0; i < al.size(); i++) {
            String value = al.get(i);
            System.out.println("Value = " + value);
        }


        System.out.println("*************************************");


//       Iterator<Map.Entry<String,String>> itr_2=h1.entrySet().iterator();
//
//        while (itr_2.hasNext())
//        {
//            Map.Entry<String,String> entry= itr_2.next();
//            String key = entry.getKey();
//            String value= entry.getValue();
//
//            System.out.println("KEY = "+key+"----"+"VALUE = "+value);
//        }


        Iterator<Map.Entry<String, String>> itr_3 = h1.entrySet().iterator();

        while (itr_3.hasNext()) {
            Map.Entry<String, String> entry = itr_3.next();
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println("KEY = " + key + "----" + "VALUE = " + value);

        }


    }
}
