package cn.imut.basics;

/**
 * 欧几里得算法
 *      计算两个非负整数 p 与 q 的最大公约数
 *      若 q 为 0，则最大公约数为 p， ===>   若除数为0，则被除数就是最大公约数
 *      否则将 p 除以 q 得到余数 r，
 *      p 和 q 的最大公约数即为 q 与 r 的最大公约数
 */
public class EuclidArithmetic {
    public static void main(String[] args) {
        int a = 16;
        int b = 12;
        System.out.println(gcd(a, b));
    }

    public static int gcd(int p, int q) {
        if(q == 0) {
            return p;
        }
        int r = p % q;
        return gcd(q, r);
    }

}
