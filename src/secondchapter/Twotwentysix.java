package secondchapter;

public class Twotwentysix {
    public void mainelement(int[] a){
        int seed=a[0];
        int count=1;
        for (int i=1;i<a.length;i++){
            if (seed==a[i]){
                count++;
            }
//            if (seed!=a[i])
            else {
                count--;
                if (count<1){
                    seed=a[i];
                }

            }
        }
        int finalcount=0;
        for (int j=0;j<a.length;j++){
            if (a[j]==seed){
                finalcount++;
            }
        }
        if (finalcount*2>a.length){
            System.out.println("这个数组有主元素："+seed);
        }
        else
            System.out.println("这个没有主元素");
    }
}
