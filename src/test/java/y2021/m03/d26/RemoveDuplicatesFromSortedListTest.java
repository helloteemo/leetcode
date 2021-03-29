package y2021.m03.d26;

import common.ListNode;
import common.Utils;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;


/**
 * @Author Frank
 * @Date 2021/3/27 4:05 下午
 */
public class RemoveDuplicatesFromSortedListTest {

    @Test
    public void deleteDuplicates() {
        RemoveDuplicatesFromSortedList r = new RemoveDuplicatesFromSortedList();
        ListNode head = Utils.parseArrayNode(new int[]{1, 1, 2, 3, 3});
        ListNode ans = r.deleteDuplicates(head);
        System.out.println(Arrays.toString(Utils.parseArray(ans)));
    }
}