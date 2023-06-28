package ArrayList_Concept;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList_MethodsDemo {

    public static void main(String[] args) {
        ArrayList<String> al_1= new ArrayList<String>();
        al_1.add("AAA");
        al_1.add("BBB");
        al_1.add("CCC");
        al_1.add("DDD");
        al_1.add("EEE");
        System.out.println(al_1);
        ArrayList<String> al_2= new ArrayList<String>();
        al_2.add("FFF");
        al_2.add("GGG");
        al_2.add("HHH");
        System.out.println(al_2);
        al_1.addAll(al_2);
        System.out.println(al_1);
//        al_1.clear();
//        System.out.println(al_1);

        ArrayList<String> cloneList = (ArrayList<String>)al_1.clone();
        System.out.println(cloneList);

        System.out.println(al_1.contains("BBB"));
        System.out.println(al_1.containsAll(al_2));
        System.out.println(al_1.indexOf("CCC"));

        ArrayList<String> ar_3= new ArrayList<String>(Arrays.asList("AAA","BBB","AAA","CCC","AAA","DDD"));
        System.out.println(ar_3.lastIndexOf("AAA"));
        System.out.println(ar_3.lastIndexOf("EEE"));//element is not present it will return negative value

        System.out.println(ar_3);

        ar_3.remove("AAA");//will remove first AAA element and others will still be present
        System.out.println(ar_3);
        ar_3.remove("AAA");
        System.out.println(ar_3);

        ArrayList<Integer> al_in= new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15));

//        System.out.println(al_in.removeIf());

        System.out.println(al_in.subList(2,6));//return type is list
        ArrayList<Integer> sub_list= new ArrayList<Integer>(al_in.subList(4,14));
        System.out.println(sub_list);

//        retainall

        int [] num = new int[10];
        num[0]=10;
        num[1]=20;
        num[2]=30;
        num[3]=40;
        num[4]=50;
        num[5]=60;
        num[6]=70;
        num[7]=80;
        System.out.println(Arrays.toString(num));

        //Converting arraylist to array

        ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList("AAA","BBB","AAA","CCC","AAA","DDD"));

        Object[] obj= arrayList.toArray();
        System.out.println(Arrays.toString(obj));

        for (int i = 0; i < obj.length ; i++) {
            System.out.println(obj[i]);

        }
    }
}
