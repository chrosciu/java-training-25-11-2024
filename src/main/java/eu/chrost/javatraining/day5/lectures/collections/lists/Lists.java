package eu.chrost.javatraining.day5.lectures.collections.lists;

import java.util.ArrayList;
import java.util.List;

public class Lists {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
//        List<Integer> list2 = new LinkedList<>();
//
//        list1.add(1);
//
//        List list3 = list1;
//        List<String> list4 = list3;
//
//        String s = list4.get(0); //class cast exception !

        list1.add(2);
        list1.add(3);
        list1.add(4);

        list1.remove(1);

        for (Integer i : list1) {
            System.out.println(i);
        }
        System.out.println(list1);
    }
}
