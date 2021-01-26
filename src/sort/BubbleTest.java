package sort;

import org.junit.Test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

import static org.junit.Assert.*;

public class BubbleTest {
    public Bubble bubble = new Bubble();
    Selection selection = new Selection();
    Insertion insertion = new Insertion();
    ShellSort shellSort=new ShellSort();
    QuickSort quickSort=new QuickSort();
    /**
     * 生成随机数组
     *
     * @param size 目标数组大小
     * @param max  目标数最大值
     */
    public int[] getRandomSet(int size, int max) {
        if (size>max){
            throw new RuntimeException("输入不合法");
        }
        Random random = new Random();
        Set<Integer> result = new LinkedHashSet<Integer>();
        while (result.size() < size) {
            Integer next = random.nextInt(max) + 1;
            result.add(next);
        }
        Object[] temp = result.toArray();
        int[] a = new int[temp.length];
        for (int i = 0; i < temp.length; i++) {
            a[i] = (int) temp[i];
        }
        return a;
    }

    @Test
    public void bubble() {
        int a[] = {1, -1, -7, 95, -3};
        a = bubble.bubble(a);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    @Test
    public void select() {
        int[] a = getRandomSet(5, 100);
        selection.select(a);
        System.out.println(Arrays.toString(a));

    }

    @Test
    public void insert() {
        int[] a = getRandomSet(5, 100);
        System.out.println(Arrays.toString(insertion.insert(a)));
    }

    @Test
    public void quick() {
        int[] a = getRandomSet(7, 100);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(quickSort.quick(a,0,a.length-1)));
    }

    @Test
    public void shellSort2() {
        int[] a = getRandomSet(100, 800000);
        System.out.println(Arrays.toString(shellSort.shellSort2(a)));
    }
}