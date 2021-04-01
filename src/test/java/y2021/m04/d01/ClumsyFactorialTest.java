package y2021.m04.d01;

import org.junit.Test;

import static org.junit.Assert.*;


/**
 * @Author Frank
 * @Date 2021/4/1 9:19 上午
 */
public class ClumsyFactorialTest {

    @Test
    public void clumsy() {
        ClumsyFactorial factorial = new ClumsyFactorial();
        assertEquals(factorial.clumsy(4), 7);
        assertEquals(factorial.clumsy(10), 12);
    }
}