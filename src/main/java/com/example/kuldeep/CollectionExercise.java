package com.example.kuldeep;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

public class CollectionExercise {
    static void arrayList(){
        ArrayList<String> name1 = new ArrayList<>();
        name1.add("Kuldeep");
        name1.add("Rohit");
        name1.add("Ankit");
        name1.add("Ronak");
        name1.add("Harsh");

        System.out.println("ArrayList");
        for(String s:name1){
            System.out.println(s);
        }
        System.out.println();
    }
    static void arrayList1(){
        ArrayList<String> name2 = new ArrayList<>();
        name2.add("Mumbai");
        name2.add("Chennai");
        name2.add("Delhi");
        name2.add("Kolkata");
        name2.add("Bangalore");

        System.out.println("ArrayList1");
        for (String s:name2
             ) {
            System.out.println(s);
        }
        System.out.println();
    }
    static void swapElements(ArrayList<Integer> num){
        Collections.swap(num,1,3);
        System.out.println("SwapElements");
        for (int n:num
             ) {
            System.out.println(n);
        }
        System.out.println();
    }
    static void joinArrayLists(ArrayList<Integer> list1){
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);
        list2.add(10);

        list1.addAll(list2);
        ArrayList<Integer> duplicates = new ArrayList<>();
        int duplicate = 0;
        for(int i=0; i<list1.size(); i++){
            for(int j=0;j<list1.size(); j++){
                if((i!=j && Objects.equals(list1.get(i), list1.get(j))) && !duplicates.contains(list1.get(i)) ){
                    duplicate+=1;
                    duplicates.add(i);
                }
            }
        }
        System.out.println("Number of duplicates are : " + duplicates.size());
        System.out.println();
    }

    static void removeDuplicates(ArrayList<Integer> list1){
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> newlist = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);
        list2.add(10);

        list1.addAll(list2);
        ArrayList<Integer> duplicates = new ArrayList<>();
        for(int n:list1){
            if(!newlist.contains(n)){
                newlist.add(n);
            }
        }
        System.out.println("After removing duplicates from list1");
        for (int n:newlist){
            System.out.print(n+" ");
        }
    }

    public static void main(String[] args){
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        System.out.println();
        arrayList();
        arrayList1();
        joinArrayLists(numbers);
        swapElements(numbers);
        removeDuplicates(numbers);
    }
}
