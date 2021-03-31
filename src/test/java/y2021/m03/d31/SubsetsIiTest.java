package y2021.m03.d31;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * @Author Frank
 * @Date 2021/3/31 8:58 上午
 */
public class SubsetsIiTest {

    @Test
    public void subsetsWithDup() {
        Subsets2 subsets = new Subsets2();
        List<List<Integer>> lists = subsets.subsetsWithDup(new int[]{1, 2, 2});
        int[][] result = new int[][]{
                {},
                {1},
                {1, 2},
                {1, 2, 2},
                {2},
                {2, 2}
        };

        lists.forEach(list -> {
            int[] arr = list.stream().mapToInt(Integer::intValue).toArray();
            Arrays.sort(arr);

        });
    }
}