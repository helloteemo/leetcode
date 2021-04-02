package y2021.m04.d02;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @Author Frank
 * @Date 2021/4/2 11:37 上午
 */
public class VolumeOfHistogramLcciTest {

    @Test
    public void trap() {
        VolumeOfHistogramLcci volume = new VolumeOfHistogramLcci();
        int res = volume.trap(new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1});
        assertEquals(res, 6);
        res = volume.trap(new int[]{2, 0, 2});
        assertEquals(res, 2);
    }
}