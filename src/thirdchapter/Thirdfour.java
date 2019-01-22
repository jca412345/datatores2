package thirdchapter;

import java.util.ArrayList;
import java.util.List;

public class Thirdfour<T> {
    private T t;
    //已知都是单调递增

    public void l1bingl2(List<T> list1,List<T> list2){
        List<T> intersection=new ArrayList<>();
        for (T var1:list1
             ) {
            for (T var2:list2
                 ) {
                if (var1.equals(var2)){
                    intersection.add(var1);
                }
            }
        }
        System.out.println(intersection);
       // System.out.println(integerList1.get(10));
    }

    //二分，时间nlogn
    public void l1bingl22(List<Integer> list1,List<Integer> list2){
        List<Integer> intersection=new ArrayList<>();
        for (Integer var1:list1
        ) {
            //二分
            if (aisinList(var1,list2)){
                intersection.add(var1);
            }
        }
        System.out.println(intersection);
    }
    //判断一个数是否在list里
    public boolean aisinList(int a,List<Integer> list2){
        //int mid=list2.size()/2;
        int start=0;
        int end=list2.size()-1;
        while (start<=end){
            int mid=(start+end)/2;
            if (a<list2.get(mid)){
                end=mid-1;
            }
            else if (a>list2.get(mid)){
                start=mid+1;
            }
            else {
                return true;
            }
        }
        return false;
    }
}
