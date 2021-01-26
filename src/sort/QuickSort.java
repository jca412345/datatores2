package sort;

//快速排序
public class QuickSort {
    public int[] quick(int[] a, int left, int right) {
        if (left >= right) {
            return a;
        }
        int l = left;
        int r = right;
        int key = a[l];

        while (l < r) {
            while (r > l && a[r] >= key) {
                r--;
            }
            a[l] = a[r];//找到没有大于的元素
            while (r > l && a[l] <= key) {
                l++;
            }

            a[r] = a[l];

        }
        a[l] = key;//最后找到a[l]的位置
        quick(a, left, l - 1);
        quick(a, r + 1, right);
        return a;
    }
}
