package thirdchapter;

import java.util.Iterator;
import java.util.List;

/**
 * 未完成
 */
public class Thirdone {
    public void printLots(List<Integer> l1,List<Integer> p1){
        Iterator iterator=p1.iterator();
        while (iterator.hasNext()){
            System.out.println(l1.indexOf(iterator.next()));
        }
    }

}
