package cn.imut.basics;

import java.util.Date;

/**
 * 若该对象的引用和参数对象的引用相同，返回true
 * 若参数为空，返回false
 * 若两个对象的类不同，返回false（同一种类型的所有对象的getClass()方法一定能够返回相同的引用）
 * 将参数对象的类型从Object转换到Data
 * 若任意实例变量的值不同，返回false
 */
public class DateDemo {

    private final int month;
    private final int day;
    private final int year;

    public DateDemo(int m, int d, int y) {
        month = m;
        day = d;
        year = y;
    }

    public int month() {
        return month;
    }

    public int day() {
        return day;
    }

    public int year() {
        return year;
    }

    public String toString() {
        return month() + "/" + day() + "/" + year();
    }

    public boolean equals(Object x) {
        if(this == x) {
            return true;
        }
        if(x == null) {
            return false;
        }
        if(this.getClass() != x.getClass()) {
            return false;
        }
        DateDemo that = (DateDemo) x;
        return true;
    }
}
