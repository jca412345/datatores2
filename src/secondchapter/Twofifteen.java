package secondchapter;

public class Twofifteen {
    private int[] a;

    //输出
    public void output1(int[] a){
        for (int i=0;i<a.length;i++){
            if (a[i]==i+1){
                System.out.println("相等的数为:"+a[i]);
            }
        }
    }
    //
    public void output2(int[] a){
        for (int i=0;i<a.length;i++){
            if (a[i]>i+1){
                System.out.println("没有整数i使得Ai=i");
                break;
            }
            if (a[i]==i+1){
                System.out.println("有整数i使得Ai=i,其值为："+a[i]);
                break;
            }
        }

    }
    //生成数组
    public int[] create(int len){
        int[] a=new int[len];
        for (int i=0;i<len;i++){
            a[i]=i*2-100;
        }
        return a;
    }
}
