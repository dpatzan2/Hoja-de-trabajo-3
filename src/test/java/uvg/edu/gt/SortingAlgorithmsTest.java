package uvg.edu.gt;

import org.junit.Test;
import uvg.edu.gt.model.SortingAlgorithms;

import static org.junit.Assert.*;

public class SortingAlgorithmsTest {
    @Test
    public void testGnomeSortIntegers() {
        Integer[] arr = {3, 2, 5, 1, 4};
        Integer[] expected = {1, 2, 3, 4, 5};
        SortingAlgorithms.gnomeSort(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testGnomeSortStrings() {
        String[] arr = {"banana", "apple", "orange", "grape", "pineapple"};
        String[] expected = {"apple", "banana", "grape", "orange", "pineapple"};
        SortingAlgorithms.gnomeSort(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testMergeSortIntegers() {
        Integer[] arr = {3, 2, 5, 1, 4};
        Integer[] expected = {1, 2, 3, 4, 5};
        SortingAlgorithms.mergeSort(arr, 0, arr.length - 1);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testMergeSortStrings() {
        String[] arr = {"banana", "apple", "orange", "grape", "pineapple"};
        String[] expected = {"apple", "banana", "grape", "orange", "pineapple"};
        SortingAlgorithms.mergeSort(arr, 0, arr.length - 1);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testQuickSortIntegers() {
        Integer[] arr = {3, 2, 5, 1, 4};
        Integer[] expected = {1, 2, 3, 4, 5};
        SortingAlgorithms.quickSort(arr, 0, arr.length - 1);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testQuickSortStrings() {
        String[] arr = {"banana", "apple", "orange", "grape", "pineapple"};
        String[] expected = {"apple", "banana", "grape", "orange", "pineapple"};
        SortingAlgorithms.quickSort(arr, 0, arr.length - 1);
        assertArrayEquals(expected, arr);
    }


    @Test
    public void testRadixSortIntegers() {
        Integer[] arr = {3, 2, 5, 1, 4};
        Integer[] expected = {1, 2, 3, 4, 5};
        SortingAlgorithms.radixSort(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testRadixSortStrings() {
        String[] arr = {"banana", "apple", "orange", "grape", "pineapple"};
        String[] expected = {"apple", "banana", "grape", "orange", "pineapple"};
        SortingAlgorithms.radixSort(arr);
        assertArrayEquals(expected, arr);
    }


    @Test
    public void testChooseThePairSortIntegers() {
        Integer[] arr = {3, 2, 5, 1, 4};
        Integer[] expected = {1, 2, 3, 4, 5};
        SortingAlgorithms.chooseThePairSort(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testChooseThePairSortStrings() {
        String[] arr = {"banana", "apple", "orange", "grape", "pineapple"};
        String[] expected = {"apple", "banana", "grape", "orange", "pineapple"};
        SortingAlgorithms.chooseThePairSort(arr);
        assertArrayEquals(expected, arr);
    }



}
