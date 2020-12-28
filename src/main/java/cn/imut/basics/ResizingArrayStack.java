package cn.imut.basics;

import java.util.Iterator;


/**
 * 动态调整数组大小的实现，
 * 几乎是所有集合类抽象数据类型的实现的模板，将所有元素保存在数组中，并动态
 * 调整数组的大小以保持数组大小和栈大小之比小于一个常数
 *
 *
 * @param <E>
 */
public class ResizingArrayStack<E> implements Iterable<E> {

    private E[] arr = (E[]) new Object[1];      //栈元素
    private int N = 0;                          //元素数量

    public boolean isEmpty() {
        return N == 0;
    }

    public int size() {
        return N;
    }

    /**
     * 将栈移动到一个大小为max的新数组
     * @param max
     */
    private void resize(int max) {
        E[] temp = (E[]) new Object[max];
        if (N >= 0)
            /*
                原数组，原数组起始位置，目标数组，目标数组起始位置，要copy的长度
             */
            System.arraycopy(arr, 0, temp, 0, N);
        arr = temp;
    }

    /**
     * 将元素添加到栈顶
     * @param e
     */
    public void push(E e) {
        if(N == arr.length)
            resize(2 * arr.length);
        arr[N++] = e;
    }

    /**
     * 从栈顶删除元素
     * @return
     */
    public E pop() {
        E e = arr[--N];
        arr[N] = null;      //避免对象游离
        if(N > 0 && N == arr.length / 4)
            resize(arr.length / 2);
        return e;
    }

    @Override
    public Iterator<E> iterator() {
        return new ReverseArrayIterator();
    }

    private class ReverseArrayIterator implements Iterator<E> {

        private int i = N;

        @Override
        public boolean hasNext() {
            return i > 0;
        }

        @Override
        public E next() {
            return arr[--i];
        }

        @Override
        public void remove() {

        }
    }
}
