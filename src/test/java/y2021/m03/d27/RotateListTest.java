package y2021.m03.d27;

import common.ListNode;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @Author Frank
 * @Date 2021/3/27 2:15 下午
 */
public class RotateListTest {

    @Test
    public void getListLength() {
        RotateList list = new RotateList();
        ListNode node3 = new ListNode(3, null);
        ListNode node2 = new ListNode(2, node3);
        ListNode node1 = new ListNode(1, node2);
        ListNode head = new ListNode(0, node1);
        assertEquals(list.getListLength(head), 4);
    }

    @Test
    public void rotateRight() {
    }
}