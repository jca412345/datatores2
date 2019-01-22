package secondchapter;

public class Twotwentyseven {
    public void search(int[][] a, int k) {
        int m = a.length;
        int n = a[0].length;
        for(int i = 0, j = n-1; j >= 0 && i < n; ){
            if(a[i][j] == k){
                System.out.println(true);
                return;
            }else if(a[i][j] < k){
                i++;
            }else{
                j--;
            }
        }
        System.out.println(false);
    }
}
