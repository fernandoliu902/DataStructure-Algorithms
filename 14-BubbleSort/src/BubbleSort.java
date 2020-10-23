import java.util.Arrays;

public class BubbleSort {

    private BubbleSort(){}

    public static <E extends Comparable<E>> void sort(E[] data){
        for (int i = 0; i < data.length-1; i++){
            // arr[n - i, n) 已排好序
            // 通过冒泡在 arr[n - i - 1] 位置放上合适的元素
            for (int j = 0; j < data.length - i - 1; j++) {
                if(data[j].compareTo(data[j+1]) > 0)
                    swap(data, j, j + 1);
            }
        }
    }
    //优化 多想一种情况 就是 如果有一轮循环后剩余部分已经是排好序的部分了
    //我们就已经排好了
    public static <E extends Comparable<E>> void sort2(E[] data){

        for(int i = 0; i + 1 < data.length; i ++){

            // arr[n - i, n) 已排好序
            // 通过冒泡在 arr[n - i - 1] 位置放上合适的元素
            boolean isSwapped = false;
            for(int j = 0; j < data.length - i - 1; j ++)
                if(data[j].compareTo(data[j + 1]) > 0){
                    swap(data, j, j + 1);
                    isSwapped = true;
                }

            if(!isSwapped) break;
        }
    }

    public static <E extends Comparable<E>> void sort3(E[] data){

        for(int i = 0; i + 1 < data.length; ){

            // arr[n - i, n) 已排好序
            // 通过冒泡在 arr[n - i - 1] 位置放上合适的元素
            int lastSwappedIndex = 0;
            for(int j = 0; j < data.length - i - 1; j ++)
                if(data[j].compareTo(data[j + 1]) > 0){
                    swap(data, j, j + 1);
                    lastSwappedIndex = j + 1;
                }

            i = data.length - lastSwappedIndex;
        }
    }

    //从后往前排序
    public static <E extends Comparable<E>> void sort4(E[] data){
        for (int i = 0; i < data.length - 1; i++) {
            for (int j = data.length-1; j < i; j--) {
                if (data[j].compareTo(data[j-1]) < 0)
                    swap(data, j, j - 1);
            }
        }

    }
    private static <E> void swap(E[] arr, int j, int i) {
        E temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {

        int n = 100000;

        Integer[] arr = ArrayGenerator.generateRandomArray(n, n);
        Integer[] arr2 = Arrays.copyOf(arr, arr.length);
        Integer[] arr3 = Arrays.copyOf(arr, arr.length);

        System.out.println("Random Array");
        SortingHelper.sortTest("BubbleSort", arr);
        SortingHelper.sortTest("BubbleSort2", arr2);
        SortingHelper.sortTest("BubbleSort3", arr3);
        System.out.println();


        arr = ArrayGenerator.generateOrderedArray(n);
        arr2 = Arrays.copyOf(arr, arr.length);
        arr3 = Arrays.copyOf(arr, arr.length);

        System.out.println("Ordered Array");
        SortingHelper.sortTest("BubbleSort", arr);
        SortingHelper.sortTest("BubbleSort2", arr2);
        SortingHelper.sortTest("BubbleSort3", arr3);
    }

}
