package org.example.collectionprac;

import java.util.ArrayList;

public class ListPractice {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        // data 삽입
        list.add(1);
        list.add(2);
        System.out.println(list);   // [1, 2]

        list.add(1, 100);
        System.out.println(list);   // [1, 100, 2]

        // 접근
        System.out.println(list.get(1));    // 100

        // 수정
        list.set(1, 10);
        System.out.println(list);   // [1, 10, 2]

        // list의 길이 (list를 반복을 돈다)
        System.out.println(list.size());    // 3


        if (!list.isEmpty()) {
            System.out.println(list.get(0));    // 1
        }

        for (Integer i : list) {
            System.out.println(i);
        }

        for (int index = 0; index < list.size(); index++) {
            int value = list.get(index);
        }


        ArrayList<String> strings = new ArrayList<>();
        strings.add("1");
    }
}
