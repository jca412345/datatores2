package search;

import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

public class MainTest {
    SeqSearch seqSearch=new SeqSearch();

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
    public void half(){
        int[] a={1,5,6,9,14,28,36,75};
        int result=seqSearch.half(a,75,0,a.length-1);
        System.out.println(result);
    }

    @Test
    public void half2(){
        int[] a={1,5,6,9,14,28,36,36,75};
        ArrayList result=seqSearch.half2(a,36,0,a.length-1);
        System.out.println(result);
    }

    @Test
    public void half3(){
        int[] a={1,5,6,9,14,28,36,75};
        int result=seqSearch.half3(a,75,0,a.length-1);
        System.out.println(result);
    }
}
