package secondchapter;

public class TwoTwentyeight {

    //求a[j]+a[i]
    public void aiaddaj(int[] a){
        int max1=a[0];
        int max2=a[1];
        int sum=0;
        for (int i=2;i<a.length;i++){
            int max=Math.max(max1,max2);
            int min=Math.min(max1,max2);
            if (min<a[i]){
                max1=max;
                max2=a[i];
            }
        }
        sum=max1+max2;
        System.out.println("最大的两个数为"+sum);
    }

    //求a[j]-a[i]
    public void ajreduceai(int[] a){

    }

    public int threeintwomax(int a,int b,int c){
        int max1=Math.max(a,b);
        int min=Math.min(a,b);
        if (max1<=c||min<c){
            return max1+c;
        }
        else {
            return a+b;
        }
    }
}
