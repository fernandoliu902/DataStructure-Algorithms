package otherSelect;

public class SelectionSort {
    private SelectionSort(){}
    public static   void sort2(int[] arr){
        for (int i = arr.length-1; i >= 0; i-- ){
            int maxIndex = i;
            for (int j = i; j >= 0; j--){
                if (arr[j]-arr[maxIndex] > 0)
                   maxIndex = j;

            }
            int temp = arr[i];
            arr[i] = arr[maxIndex];
            arr[maxIndex] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 3, 6, 5};
        SelectionSort.sort2(arr);
        for(Integer e: arr)
            System.out.print(e + " ");
        System.out.println();
    }
}
