package sort;

//插入排序
public class Insertion {
    public int[] insert(int[] a){
        for (int i = 1; i < a.length; i++) {
            int insertVal=a[i];
            int insertIndex=i-1;
            while (insertIndex>=0&&insertVal<a[insertIndex]){
                a[insertIndex+1]=a[insertIndex];
                insertIndex--;
            }
            a[insertIndex+1]=insertVal;
        }
        return a;
    }
}
