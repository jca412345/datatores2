package search;

import java.util.ArrayList;
import java.util.List;

//二分查找
public class SeqSearch {

    //返回的是索引值
    public int half(int[] a, int key, int left, int right) {
        if (left > right) {
            throw new RuntimeException("没有找到这个数");
        }
        int mid = (left + right) / 2;
        int pivot = a[mid];
        if (key < pivot) {
            return half(a, key, left, mid - 1);
        } else if (key > pivot) {
            return half(a, key, mid + 1, right);
        } else {
            return mid;
        }
    }

    //返回有相同值的下标集合
    public ArrayList half2(int[] a, int key, int left, int right) {
        if (left > right) {
            return new ArrayList();
        }
        int mid = (left + right) / 2;
        int pivot = a[mid];
        if (key < pivot) {
            return half2(a, key, left, mid - 1);
        } else if (key > pivot) {
            return half2(a, key, mid + 1, right);
        } else {
            ArrayList resultList = new ArrayList();

            int temp = mid - 1;//向左扫描
            while (true) {
                if (temp < 0 || a[temp] != key) {
                    break;
                }
                resultList.add(temp);
                temp--;
            }

            resultList.add(mid);//把中间的加上

            int temp2 = mid + 1;//向右扫描
            while (true) {
                if (temp2 > a.length - 1 || a[temp2] != key) {
                    break;
                }
                resultList.add(temp2);
                temp2++;
            }
            return resultList;
        }
    }

    //将1/2修改，提高二分法查找，也就是插值查找
    //返回的是索引值
    public int half3(int[] a, int key, int left, int right) {
        if (left > right) {
            throw new RuntimeException("没有找到这个数");
        }
        int mid = (key - a[left]) / (a[right] - a[left]) * (left + right);//将1/2修改
        int pivot = a[mid];
        if (key < pivot) {
            return half(a, key, left, mid - 1);
        } else if (key > pivot) {
            return half(a, key, mid + 1, right);
        } else {
            return mid;
        }
    }
}
