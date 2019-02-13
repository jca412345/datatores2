package thirdchapter;

import secondchapter.Twoeight;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Run {
    public static void main(String[] args) {
        //3-1
        /*Twoeight twoeight=new Twoeight();
        int[] la=twoeight.generate2(10);
        int[] ga={1,3,2,8};
        NodeInterface<Integer> list=(NodeInterface) Arrays.asList(la);

        NodeInterface<Integer> plist=(NodeInterface) Arrays.asList(ga);*/

        //3-4
        /*Thirdfour thirdfour=new Thirdfour();
        NodeInterface<Integer> list1=new ArrayList<>();
        NodeInterface<Integer> list2=new ArrayList<>();
        for (int i=0;i<1000;i++){
            list1.add(i);
        }
        for (int i=7;i<2500;i++){
            list2.add(i);
        }
        NodeInterface<String> list3=new ArrayList<>();
        NodeInterface<String> list4=new ArrayList<>();
        //I am the bone of my sword Steel is my body&Fire is my bloodI have created over a thousand bladesUnknown to Death,Nor known to LifeHave with stood pain to create many weaponsYet,those hands will never hold anythingSo as I pray,Unlimited Blade Works
        String rune="I am the bone of my sword";
        String rune1="Steel is my body";
        String[] var=rune.split(" ");
        String[] var1=rune1.split(" ");
        for (int i=0;i<var.length;i++)
            list3.add(var[i]);
        for (int j=0;j<var1.length;j++)
            list4.add(var1[j]);*/
        //3-6
//


        //3-8
//        Thirdseven thirdseven=new Thirdseven();
////        List<Integer> list1=new ArrayList<>();
////        for (int i=0;i<100000;i++){
////            list1.add(i);
////        }
////        List<Integer> list2=new LinkedList<>();
////        for (int i=0;i<200000;i++){
////            list2.add(i);
////        }

//        Integer a=new Integer(200);
//        Integer b=new Integer(300);
//        System.out.println(list2);

        long starttime=System.currentTimeMillis();
        //thirdfour.l1bingl2(list1,list2);//14
            //thirdfour.l1bingl2(list3,list4);
        //thirdfour.l1bingl22(list1,list2);//2
//        thirdseven.remove(list1);//211
//        thirdseven.remove(list2);//2
//        thirdseven.removeIter(list1);//212
//        thirdseven.removeIter(list2);//3

        long endtime=System.currentTimeMillis();
        System.out.println("运行总时间"+(endtime-starttime));
    }

}
