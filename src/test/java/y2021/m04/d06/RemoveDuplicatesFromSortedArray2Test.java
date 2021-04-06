package y2021.m04.d06;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * @Author Frank
 * @Date 2021/4/6 1:41 下午
 */
public class RemoveDuplicatesFromSortedArray2Test {


    @Test
    public void removeDuplicates() {
        RemoveDuplicatesFromSortedArray2 array2 = new RemoveDuplicatesFromSortedArray2();
        int[] arr = new int[]{0, 0, 1, 1, 1, 1, 2, 3, 3};
        int ans1 = array2.removeDuplicates(arr);
        assertEquals(7, ans1);
        assertTrue(arrayEquals(arr, new int[]{0, 0, 1, 1, 2, 3, 3}, 7));
    }

    public boolean arrayEquals(int[] arr1, int[] arr2, int len) {
        if (arr1 == null && arr2 == null) {
            return true;
        }
        if (arr1 == null || arr2 == null) {
            return false;
        }
        if (arr1.length<  len || arr2.length < len) {
            return false;
        }
        for (int i = 0; i < len; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }
}