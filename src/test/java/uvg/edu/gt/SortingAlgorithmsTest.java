package uvg.edu.gt;

import org.junit.Test;
import uvg.edu.gt.model.SortingAlgorithms;

import static org.junit.Assert.*;

public class SortingAlgorithmsTest {

    @Test
    public void testGnomeSort() {
        Integer[] arr = {5, 2, 9, 1, 6};
        SortingAlgorithms.gnomeSort(arr);
        Integer[] expected = {1, 2, 5, 6, 9};
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testMergeSort() {
        Integer[] arr = {5, 2, 9, 1, 6};
        SortingAlgorithms.mergeSort(arr, 0, arr.length - 1);
        Integer[] expected = {1, 2, 5, 6, 9};
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testQuickSort() {
        Integer[] arr = {5, 2, 9, 1, 6};
        SortingAlgorithms.quickSort(arr, 0, arr.length - 1);
        Integer[] expected = {1, 2, 5, 6, 9};
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testRadixSort() {
        Integer[] arr = {5, 2, 9, 1, 6};
        SortingAlgorithms.radixSort(arr);
        Integer[] expected = {1, 2, 5, 6, 9};
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testChooseThePairSort() {
        Integer[] arr = {5, 2, 9, 1, 6};
        SortingAlgorithms.chooseThePairSort(arr);
        Integer[] expected = {1, 2, 5, 6, 9};
        assertArrayEquals(expected, arr);
    }
}
