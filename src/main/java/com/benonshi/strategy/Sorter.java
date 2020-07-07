package com.benonshi.strategy;

/**
 * @author BenOniShi
 * @date 2020/7/7 21:33
 */
public class Sorter<T> {

    public void sort(T[] arr, Comparator<T> comparator) {
        for (int i = 0; i < arr.length - 1; i++) {
            int mid = i;
            for (int j = 0; j < arr.length; j++) {
                mid = comparator.compare(arr[i], arr[j]) == -1 ? mid : j;
            }
            swap(arr, i, mid);
        }
    }

    private void swap(T[] arr, int i, int mid) {
        T temp = arr[i];
        arr[i] = arr[mid];
        arr[mid] = temp;
    }

}
