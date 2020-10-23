package performance;

public class SelectionSort {
    public static <E extends Comparable<E>> void sort(E[] arr){

        // arr[0...i) 是有序的；arr[i...n) 是无序的
        for(int i = 0; i < arr.length; i ++){

            // 选择 arr[i...n) 中的最小值
            int minIndex = i;
            for(int j = i; j < arr.length; j ++){
                if(arr[j].compareTo(arr[minIndex]) < 0)
                    minIndex = j;
            }

            E temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;

        }
    }
    public static void main(String[] args){

        int[] dataSize = {10000, 100000};
        for(int n: dataSize){
            Integer[] arr = ArrayGenerator.generateRandomArray(n, n);
            SortingHelper.sortTest("SelectionSort", arr);
        }
    }
}
