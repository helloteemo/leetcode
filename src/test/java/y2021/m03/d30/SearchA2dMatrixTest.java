package y2021.m03.d30;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @Author Frank
 * @Date 2021/3/30 9:07 上午
 */
public class SearchA2dMatrixTest {

    @Test
    public void searchMatrix() {

        int[][] array = new int[][]{
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 60},
        };
        SearchA2dMatrix searchA2dMatrix = new SearchA2dMatrix();

        assertTrue(searchA2dMatrix.searchMatrix(array, 3));
        assertFalse(searchA2dMatrix.searchMatrix(array, 13));
    }
}