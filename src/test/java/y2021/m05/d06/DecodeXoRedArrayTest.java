package y2021.m05.d06;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @Author HelloTeemo
 * @Date 2021/5/6 4:29 下午
 */
public class DecodeXoRedArrayTest {

    @Test
    public void decode() {
        DecodeXoRedArray decode = new DecodeXoRedArray();
        int[] ints = decode.decode(new int[]{1, 2, 3}, 1);
        assertArrayEquals(ints, new int[]{1, 0, 2, 1});
    }
}