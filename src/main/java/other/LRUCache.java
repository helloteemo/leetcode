package other;

import sun.jvm.hotspot.types.CIntegerField;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @Author Frank
 * @Date 2021/4/7 11:24 上午
 */
public class LRUCache {

    private class Node {
        int key;
        int val;
        Node prev;
        Node next;

        public Node() {
        }

        public Node(int key, int val) {
            this.val = val;
            this.key = key;
        }

        public Node(Node prev, int key, int val, Node next) {
            this.prev = prev;
            this.key = key;
            this.val = val;
            this.next = next;
        }
    }

    private Map<Integer, Node> map;
    private int capacity;
    private int size;

    private Node head;
    private Node tail;

    public LRUCache(int capacity) {
        map = new HashMap<>();
        head = new Node();
        tail = new Node();
        this.capacity = capacity;
        this.size = 0;
    }

    /**
     * @param key
     * @return
     */
    public int get(int key) {
        Node node = map.get(key);
        if (node == null) {
            return -1;
        }
        move2Head(node);
        return node.val;
    }

    public void put(int key, int value) {
        Node node = map.get(key);
        if (node != null) {
            node.val = value;
            move2Head(node);
            return;
        }
        size++;
        node = new Node(key, value);
        add2Head(node);
        if (size > capacity) {
            Node needDel = removeTail();
            map.remove(needDel);
            size--;
        }
    }

    private void move2Head(Node node) {

    }

    private Node removeNode(Node node) {
        return null;
    }

    private Node removeTail() {
        return null;
    }

    private void add2Head(Node node) {
        node.prev = head;
        node.next = head.next;
        head.next.prev = node;
        head.next = node;
    }
}
