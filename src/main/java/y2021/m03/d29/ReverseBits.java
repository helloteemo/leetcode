package y2021.m03.d29;

/**
 * @Author Frank
 * @Date 2021/3/29 8:51 上午
 */
public class ReverseBits {
    /**
     * you need treat n as an unsigned value
     */
    public int reverseBits(int n) {
        int res = 0;
        for (int i = 0; i < 32 || n != 0; i++) {
            res |= (n & 1) << (31 - i);
            n >>>= 1;
        }
        return res;
    }
}
