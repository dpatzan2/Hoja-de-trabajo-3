package uvg.edu.gt.model;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class SortingAlgorithms {

    public static <T extends Comparable<T>> void gnomeSort(T[] arr) {
        int index = 0;

        while (index < arr.length) {
            if (index == 0 || arr[index].compareTo(arr[index - 1]) >= 0) {
                index++;
            } else {
                // Intercambia los elementos
                T temp = arr[index];
                arr[index] = arr[index - 1];
                arr[index - 1] = temp;
                index--;
            }
        }
    }

    public static <T extends Comparable<T>> void mergeSort(T[] arr, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;

            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            merge(arr, left, mid, right);
        }
    }

    private static <T extends Comparable<T>> void merge(T[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        Object[] leftArr = new Object[n1];
        Object[] rightArr = new Object[n2];

        System.arraycopy(arr, left, leftArr, 0, n1);
        System.arraycopy(arr, mid + 1, rightArr, 0, n2);


        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (((T) leftArr[i]).compareTo((T) rightArr[j]) <= 0) {
                arr[k++] = (T) leftArr[i++];
            } else {
                arr[k++] = (T) rightArr[j++];
            }
        }

        while (i < n1) {
            arr[k++] = (T) leftArr[i++];
        }


        while (j < n2) {
            arr[k++] = (T) rightArr[j++];
        }
    }

    public static <T extends Comparable<T>> void quickSort(T[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);

            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    private static <T extends Comparable<T>> int partition(T[] arr, int low, int high) {
        T pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j].compareTo(pivot) < 0) {
                i++;


                T temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }


        T temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    public static <T extends Comparable<T>> void radixSort(T[] arr) {

        T max = arr[0];
        for (T item : arr) {
            if (item.compareTo(max) > 0) {
                max = item;
            }
        }


        int maxDigits = String.valueOf(max).length();


        List<List<T>> buckets = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            buckets.add(new LinkedList<>());
        }

        for (int digitPlace = 1; digitPlace <= maxDigits; digitPlace++) {

            for (T item : arr) {
                int digit = getDigit(item, digitPlace);
                buckets.get(digit).add(item);
            }


            int index = 0;
            for (List<T> bucket : buckets) {
                for (T item : bucket) {
                    arr[index++] = item;
                }
                bucket.clear();
            }
        }
    }

}
