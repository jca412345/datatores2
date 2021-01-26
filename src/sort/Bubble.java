package sort;

//冒泡
public class Bubble {

    //从小到大排序
    public int[] bubble(int[] a) {
        for (int i = a.length; i > 0; i--) {
            for (int k = 0; k < i-1; k++) {
                if (a[k]>a[k+1]){
                    int temp=a[k];
                    a[k]=a[k+1];
                    a[k+1]=temp;
                }
            }
        }
        return a;
    }
    //从小到大排序优化，当有一趟比较时没有任何元素交换则表明已经是有序
    public int[] bubble1(int[] a) {
        boolean flag=false;
        for (int i = a.length; i > 0; i--) {
            for (int k = 0; k < i-1; k++) {
                if (a[k]>a[k+1]){
                    flag=true;
                    int temp=a[k];
                    a[k]=a[k+1];
                    a[k+1]=temp;
                }
            }
            if (flag==false){
                break;
            }else {
                flag=false;//进行下次访问
            }
        }
        return a;
    }
}
