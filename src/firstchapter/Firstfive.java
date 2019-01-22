package firstchapter;

public class Firstfive {
    private int count=0;
    public void output(int n){
        if (n==0){
            System.out.println(count);
            return;
        }
        if (n%2==1){
            count++;
            output(n/2);
        }
        if (n % 2 == 0) {
            output(n/2);
        }

    }
}
