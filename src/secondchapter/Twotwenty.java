package secondchapter;

public class Twotwenty {
    public boolean prime1(int n){
        if (n==2||n==1)
            return true;
        if (n<1)
            return false;
        double flag=Math.sqrt(n);
        for (int i=2;i<=flag;i++){
            if (n%i==0){
                System.out.println(n+"这不是素数");
                return true;
            }

        }
        System.out.println("这是素数");
        return false;
    }
}
