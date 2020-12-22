package cn.imut.basics.test;

import cn.imut.basics.Queue;

import java.util.Scanner;

public class QueueTest {
    public static void main(String[] args) {

        //队列最大容量是3
        Queue queue = new Queue(4);

        queue.addQueue(2);
        queue.addQueue(4);
        queue.addQueue(5);

        queue.showQueue();
        System.out.println("头数据为" + queue.headQueue());
        System.out.println("----------------------");
        queue.getQueue();
        queue.getQueue();
        System.out.println("----------------------");
        queue.showQueue();
    }
}
