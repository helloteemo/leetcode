package y2021.m04.d10;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @Author Frank
 * @Date 2021/4/10 9:49 上午
 */
public class UglyNumberTest {

    @Test
    public void isUgly() {
        UglyNumber uglyNumber = new UglyNumber();
        assertFalse(uglyNumber.isUgly(0));
        assertTrue(uglyNumber.isUgly(1));
        assertTrue(uglyNumber.isUgly(6));
        assertFalse(uglyNumber.isUgly(14));
    }
}