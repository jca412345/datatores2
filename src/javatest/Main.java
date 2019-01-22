package javatest;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] a=new int[10];
        for (int i=0;i<a.length;i++){
            a[i]=i+1;
        }
        for (int ai: a
             ) {
            System.out.println(ai);
        }
        List<Integer> list=new LinkedList<>();
        Iterator j=list.iterator();
        j.hasNext();

    }
}
