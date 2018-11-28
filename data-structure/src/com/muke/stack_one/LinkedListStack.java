package com.muke.stack_one;

import com.muke.linkedlist_three.LinkedList;

/**
 * 基于链表实现的栈
 * Program Name: data-structure
 * Created by yanlp on 2018/10/13
 *
 * @author yanlp
 * @version 1.0
 */
public class LinkedListStack<E> implements Stack<E> {
    /**
     * 链表
     */
    private LinkedList<E> list;

    /**
     * 构造函数
     */
    public LinkedListStack() {
        list = new LinkedList<>();
    }

    @Override
    public void push(E e) {
        list.addFirst(e);
    }

    @Override
    public E pop() {
        return list.removeFirst();
    }

    @Override
    public E peek() {
        return list.getFirst();
    }

    @Override
    public int getSize() {
        return list.getSize();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append("Stack: top ");
        res.append(list);
        return res.toString();
    }

    public static void main(String[] args) {
        LinkedListStack<Integer> stack = new LinkedListStack<>();
        for (int i = 0; i < 5; i++) {
            stack.push(i);
            System.out.println(stack);
        }
        stack.pop();
        System.out.println(stack);
    }
}
