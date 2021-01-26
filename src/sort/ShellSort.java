package sort;

//希尔排序
public class ShellSort {
    //交换法（低效）
    public int[] shellSort(int[] a) {
        int temp = 0;
        for (int gap = a.length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < a.length; i++) {
                for (int j = i - gap; j >= 0; j -= gap) {
                    if (a[j] > a[j + gap]) {
                        temp = a[j + gap];
                        a[j + gap] = a[j];
                        a[j] = temp;
                    }
                }
            }
        }
        return a;
    }

    //移动法（高效）
    public int[] shellSort2(int[] a) {
        for (int gap = a.length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < a.length; i++) {
                int j = i;
                int temp = a[j];
                if (a[j] < a[j - gap]) {
                    while (j - gap >= 0 && temp < a[j - gap]) {
                        a[j] = a[j - gap];
                        j -= gap;
                    }
                    a[j] = temp;
                }
            }
        }
        return a;
    }

}
