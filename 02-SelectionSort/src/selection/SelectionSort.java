package selection;

public class SelectionSort {
    private  SelectionSort(){}
    public static void sort(int[] arr){
        for (int i = 0; i < arr.length; i++){
            //选择arr[i...n) 中的最小值的索引
            int minIndex = i;
            for(int j = i; j < arr.length; j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }

        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 3, 6, 5};
        SelectionSort.sort(arr);
        for(int e: arr)
            System.out.print(e + " ");
        System.out.println();
    }
}
