package cn.imut.basics;

import org.junit.Test;

/**
 * 第一章作业
 */

public class assignment {

    @Test
    public void test1() {
        System.out.println((0 + 15) / 2);
        System.out.println(true && false || true && true);
        System.out.println((1 + 2.236) / 2);
        System.out.println(1 + 2 + "3");
    }

    /**
     * 将一个正整数N用二进制表示并转换为一个String类型的值
     * N = 5;
     */
    @Test
    public void test2() {
        String s = "";
        //10 - 2,除法运算
        for (int i = 5; i > 0; i /= 2) {        //走 2 ^ 3 ，大于
            s = (i % 2) + s;
        }
        System.out.println(s);
    }

    //内部方法
    @Test
    public void test3() {
        int n = 5;
        String s = Integer.toBinaryString(n);
        System.out.println(s);
    }
}
