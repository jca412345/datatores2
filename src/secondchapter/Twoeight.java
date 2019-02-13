package secondchapter;

import java.util.Random;

public class Twoeight {
    private int[] a;

    public int[] getA() {
        return a;
    }



    public void setA(int[] a) {

        this.a = a;
    }
    public void generate1(int len){
        int[] b=new int[len];
        int use=0;
        for (int i=0;i<len;i++){
            use=rand(len);
            if (isrepeat(use,b,i)){
                i=i-1;
                continue;
            }
            if (!isrepeat(use,b,i)){
                b[i]=use;
            }
        }

        output(b);
    }

    public int rand(int bound){
        Random random=new Random();
        return random.nextInt(bound)+1;
    }
    public boolean isrepeat(int use,int[] b,int i){
        for (int j=0;j<=i;j++){
            if (b[j]==use){
                return true;
            }
        }
        return false;
    }
    public int[] generate2(int len){
        int[] b=new int[len];
        int temp=0;
        Random random=new Random();
        for (int j = 0; j < len; j++)
            b[j] = j + 1;
        for (int i = 0; i < len; i++){
            int o=-1;

                o=random.nextInt(len-i)+i;
                temp=b[i];
                b[i]=b[o];
                b[o]=temp;


        }
        output(b);
        return b;
    }


    public void output(int[] b){
        for (int l=0;l<b.length;l++)
            System.out.println(b[l]);
    }
}
