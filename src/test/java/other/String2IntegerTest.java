package other;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @Author Frank
 * @Date 2021/3/31 10:16 下午
 */
public class String2IntegerTest {

    @Test
    public void myAtoi() {
        String2Integer atoi = new String2Integer();
        assertEquals(atoi.myAtoi("42"), 42);
        assertEquals(atoi.myAtoi("   -42"), -42);
        assertEquals(atoi.myAtoi("+-42"), 0);
        assertEquals(atoi.myAtoi("4193 with words"), 4193);
        assertEquals(atoi.myAtoi("words and 987"), 0);
        assertEquals(atoi.myAtoi("-91283472332"), -2147483648);
    }
}