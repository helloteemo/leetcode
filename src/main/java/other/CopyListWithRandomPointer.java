package other;


import java.util.HashMap;

/**
 * @Author Frank
 * @Date 2021/3/31 9:30 下午
 * <p>
 * 复制带随机指针的链表
 *
 * <a>https://leetcode-cn.com/problems/copy-list-with-random-pointer/</a>
 */
public class CopyListWithRandomPointer {

    class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }

    public Node copyRandomList(Node head) {
        return copyRandomList1(head);
    }

    /**
     *
     * @param head 随机链表
     * @return 深度复制的随机链表
     */
    public Node copyRandomList1(Node head) {
        if (head == null) {
            return null;
        }
        HashMap<Node, Node> map = new HashMap<>();
        Node p = head;
        while (p != null) {
            Node tmp = new Node(p.val);
            map.put(p, tmp);
            p = p.next;
        }

        p = head;
        while (p != null) {
            Node newNode = map.get(p);
            if (newNode != null) {
                newNode.next = map.get(p.next);
                newNode.random = map.get(p.random);
            }
            p = p.next;
        }
        return map.get(head);
    }

    public Node copyRandomList2(Node head) {
        return head;
    }
}
