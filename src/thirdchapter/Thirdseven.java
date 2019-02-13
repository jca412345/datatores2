package thirdchapter;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Thirdseven<T> {

        /*public static NodeInterface<Integer> makelist(int N){
            NodeInterface<Integer> lst =new ArrayList<>();
            for(int i=0; i< N; i++){
                lst.add(i);
                lst.trimtosize();
            }
        }*/
    public void remove(List<T> lst)
    {
        int size=lst.size()/2;
        for (int i=0;i<size;i++){
            lst.remove(0);
        }
    }
    public void removeIter(List<T> lst)
    {
        int size=lst.size()/2;
        Iterator iterator= lst.iterator();

            for (int i=0;i<size;i++){

                iterator.next();
                iterator.remove();
            }
//        System.out.println(lst);
    }
}
