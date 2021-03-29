package common;


/**
 * @Author Frank
 * @Date 2021/3/27 2:04 下午
 * <p>
 * 定义列表中的某一个节点
 * </p>
 */
public class ListNode {
    public int val;
    public ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

}
