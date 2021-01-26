package sort;

//选择
public class Selection {

    //选择排序
    public int[] select(int[] a){
        for (int i = 0; i < a.length-1; i++) {
            for (int j=i+1;j<a.length;j++){
                if (a[i]>a[j]){
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        return a;
    }
}
