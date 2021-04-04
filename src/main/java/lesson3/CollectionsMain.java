package lesson3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionsMain {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        List<Integer> list1 = Arrays.asList(1, 2, 3);
        list.addAll(list1);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }


        for (Integer listElement : list) {
            System.out.println(listElement);
        }

//        System.out.println(list);
//        System.out.println(list.get(0));
//
//        list.add(4);
//        System.out.println(list);
//
//        list.remove(0);
//        System.out.println(list);
//
//        System.out.println(list.get(0));
    }
}
