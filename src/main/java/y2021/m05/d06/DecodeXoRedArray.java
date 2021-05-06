package y2021.m05.d06;

/**
 * @Author HelloTeemo
 * @Date 2021/5/6 4:28 下午
 */
public class DecodeXoRedArray {
    public int[] decode(int[] encoded, int first) {
        if (encoded.length < 2) {
            return null;
        }
        int[] result = new int[encoded.length + 1];
        result[0] = first;
        result[1] = first ^ result[0];
        for (int i = 1; i < encoded.length; i++) {
            result[i + 1] = result[i] ^ encoded[i];
        }
        return result;
    }
}
