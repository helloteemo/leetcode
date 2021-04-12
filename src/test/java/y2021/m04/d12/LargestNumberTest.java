package y2021.m04.d12;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @Author Frank
 * @Date 2021/4/12 10:53 上午
 */
public class LargestNumberTest {

    @Test
    public void largestNumber() {
        LargestNumber number = new LargestNumber();
        int[] arr = new int[]{3, 30, 34, 5, 9};
        int[] arr2 = new int[]{0, 0};
        int[] arr3 = new int[]{1};
        int[] arr4 = new int[]{10, 2, 9, 39, 17};
        assertEquals(number.largestNumber(arr), "9534330");
        assertEquals(number.largestNumber(arr2), "0");
        assertEquals(number.largestNumber(arr3), "1");
        assertEquals(number.largestNumber(arr4), "93921710");
    }
}