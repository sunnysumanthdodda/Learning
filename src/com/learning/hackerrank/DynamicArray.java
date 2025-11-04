package com.learning.hackerrank;

import java.util.ArrayList;
import java.util.List;

public class DynamicArray {
    static void main() {
//        Scanner sc = new Scanner(System.in);
//        int a= 5,b=5;

//        List<Integer> inputArray = new ArrayList<>();
//        List<Integer> queries = new ArrayList<>();

        List<List<Integer>> arrayList = new ArrayList<>();
        List<List<Integer>> queriesList = new ArrayList<>();


        arrayList.add(List.of(41, 77, 74, 22, 44));
        arrayList.add(List.of(12));
        arrayList.add(List.of(37,34,36,52));
        arrayList.add(new ArrayList<>());
        arrayList.add(List.of(20,22,23));
        arrayList.add(List.of(20,22,24));
        arrayList.add(List.of(20,22,23));
        arrayList.add(List.of(20,22,23));
        arrayList.add(List.of(20,22,23));


        queriesList.add(List.of(1,3));
        queriesList.add(List.of(3,4));
        queriesList.add(List.of(3,1));
        queriesList.add(List.of(4,3));
        queriesList.add(List.of(5,5));

//        for(int i=0;i<a;i++){
//            inputArray.add(sc.nextInt());
//        }
//
//        for(int i=0;i<a;i++){
//            List<Integer> temp = new ArrayList<>();
//            for(int j=0;j<inputArray.get(i);j++){
//                temp.add(sc.nextInt());
//            }
//            arrayList.add(temp);
//        }

        for (List<Integer> requiredList : queriesList) {
            List<Integer> requiredArray = arrayList.get(requiredList.get(0)-1);
//            System.out.println(requiredArray);
            if (requiredArray.size() >= requiredList.get(1)) {
                System.out.println(requiredArray.get(requiredList.get(1)-1));
            } else System.out.println("ERROR!");
        }

//        System.out.println(arrayList);
//        System.out.println(queriesList);


//        System.out.println(arrayList);
    }
}
