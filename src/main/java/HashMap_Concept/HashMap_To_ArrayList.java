package HashMap_Concept;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMap_To_ArrayList {

    public static void main(String[] args) {

        HashMap<String, Integer> student_data = new HashMap<String, Integer>();

        student_data.put("Vipil", 100);
        student_data.put("Komal", 101);
        student_data.put("Amu", 103);
        student_data.put("Shruti", 104);
        student_data.put("Divya", 105);
        student_data.put("null", 106);

        Iterator<String> iterator= student_data.keySet().iterator();

        while (iterator.hasNext())
        {
            String key = iterator.next();
            Integer value= student_data.get(key);

            System.out.println("Keys are ="+key +" Values are = "+value);
        }
        System.out.println("---------------------");

        Iterator<Map.Entry<String,Integer>> itr =student_data.entrySet().iterator();

        while (itr.hasNext())
        {
            Map.Entry<String,Integer> entry= itr.next();

            System.out.println(entry.getKey()+"--"+entry.getValue());


        }
        System.out.println("---------------------");

        ArrayList<String> al_key= new ArrayList<String>(student_data.keySet());
        for (int i = 0; i < al_key.size() ; i++) {
            System.out.println(al_key.get(i));

        }
        System.out.println("---------------------");

        ArrayList<Integer> al_value= new ArrayList<Integer>(student_data.values());
        for (int i = 0; i < al_value.size() ; i++) {
            System.out.println(al_value.get(i));

        }


    }
}
