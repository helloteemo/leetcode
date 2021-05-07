package y2021.m05.d07;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @Author HelloTeemo
 * @Date 2021/5/7 3:37 下午
 */
public class XorOperationInAnArrayTest {

    @Test
    public void xorOperation() {
        XorOperationInAnArray xorOperationInAnArray = new XorOperationInAnArray();
        int ans = xorOperationInAnArray.xorOperation(4, 3);
        assertEquals(ans, 8);
    }
}