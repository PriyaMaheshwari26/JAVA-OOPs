package com.company.generics;

import java.util.Arrays;

public class CustomGenericArrayList<T> {
//    private T[] data;
//    private static int DEFAULT_SIZE = 10;
//    private int size = 0; // also working as index value
//
//    public CustomGenericArrayList() {
//        this.data = new T[DEFAULT_SIZE];
//    }
//
//    public void add(T num) {
//        if (isFull()) {
//            resize();
//        }
//        data[size++] = num;
//    }
//
//    private void resize() {
//        int[] temp = new int[data.length * 2];
//
//        // copy the current items in the new array
//        for (int i = 0; i < data.length; i++) {
//            temp[i] = data[i];
//        }
//        data = temp;
//    }
//
//    private boolean isFull() {
//        return size == data.length;
//    }
//
//    public int remove() {
//        int removed = data[--size];
//        return removed;
//    }
//
//    public int get(int index) {
//        return data[index];
//    }
//
//    public int size() {
//        return size;
//    }
//
//    public void set(int index, int value) {
//        data[index] = value;
//    }
//
//    @Override
//    public String toString() {
//        return "CustomArrayList{" +
//                "data=" + Arrays.toString(data) +
//                ", size=" + size +
//                '}';
//    }
//
//    public static void main(String[] args) {
////        ArrayList list = new ArrayList();
//        CustomGenericArrayList list = new CustomGenericArrayList();
////        list.add(3);
////        list.add(5);
////        list.add(9);
//
//        for (int i = 0; i < 14; i++) {
//            list.add(2 * i);
//        }
//
//        System.out.println(list);
//        //CustomArrayList{data=[3, 5, 9, 0, 0, 0, 0, 0, 0, 0], size=3}
//
//        //ArrayList<Integer> list2 = new ArrayList<>();
////        list2.add("dfghj");
//
//
//    }
}
