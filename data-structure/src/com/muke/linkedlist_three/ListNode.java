package com.muke.linkedlist_three;

/**
 * leetCode中代码
 * Program Name: data-structure
 * Created by yanlp on 2018/10/15
 *
 * @author yanlp
 * @version 1.0
 */
public class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }

    public ListNode(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("arr can not be empty");
        }
        this.val = arr[0];
        ListNode cur = this;
        for (int i = 0; i < arr.length; i++) {
            cur.next = new ListNode(arr[i]);
            cur = cur.next;
        }
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        ListNode cur = this;
        while (cur != null) {
            res.append(cur.val + " -> ");
            cur = cur.next;
        }
        res.append("NULL");
        return res.toString();
    }
}
