package y2021.m03.d30;

/**
 * @Author Frank
 * @Date 2021/3/30 8:57 上午
 * <p>
 * 搜索二维矩阵
 *
 * <a>https://leetcode-cn.com/problems/search-a-2d-matrix/</a>
 */
public class SearchA2dMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        for (int i = matrix.length - 1; i >= 0; i--) {
            if (matrix[i][0] == target) {
                return true;
            } else if (matrix[i][0] < target) {
                // 往列搜索
                for (int j = 0; j < matrix[i].length; j++) {
                    if (matrix[i][j] == target) {
                        return true;
                    }
                }
                return false;
            }
        }
        return false;
    }
}
