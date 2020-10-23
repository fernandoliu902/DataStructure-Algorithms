import java.util.Arrays;

public class MergeSort {

    private MergeSort(){}

    public static <E extends Comparable<E>> void sort(E[] arr){
        sort(arr, 0, arr.length - 1);
    }

    private static <E extends Comparable<E>> void sort(E[] arr, int l, int r){

        if(l >= r) return;

        int mid = (l + r) / 2;
        sort(arr, l , mid);
        sort(arr, mid + 1, r);
        merge(arr, l, mid, r);
    }

    //合并两个有序区间 arr[l, mid] 和 arr[mid+1, r]
    public static <E extends Comparable<E>> void merge(E[] arr, int l, int mid, int r){

        E[] temp = Arrays.copyOfRange(arr, l, r + 1); //区间为前闭后开

        int i = l;
        int j = mid + 1;
        //每轮循环 arr[k]赋值
        for (int k = l; k <=r ; k++) {
            if(i > mid){
                arr[k] = temp[j - l]; //因为原数组由l开始的所以有偏移
                j++;
            }
            else if(j > r){
                arr[k] = temp[i - l];//因为原数组由l开始的所以有偏移
                i++;
            }else if(temp[i-l].compareTo(temp[j-l]) <= 0){
                arr[k] = temp[i - l];
                i++;
            }else{
                arr[k] = temp[j - l];
                j++;
            }
        }
    }

    public static void main(String[] args) {

    }
}
