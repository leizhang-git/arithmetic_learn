package cn.imut.basics.test;

import cn.imut.basics.Stack;

public class StackTest {
    public static void main(String[] args) {
        Stack stack = new Stack(10);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.list();
        System.out.println("----------------");
        stack.pop();
        stack.pop();
        stack.pop();
        stack.list();
    }
}
