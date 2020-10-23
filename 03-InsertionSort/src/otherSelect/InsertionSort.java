package otherSelect;

public class InsertionSort {
    private InsertionSort(){}
    public static void sort(int[] arr){
        for (int i = arr.length-1; i >=0; i-- ){
            int temp = arr[i];
            int j;
            for(j = i; j < arr.length-1 && temp > arr[j+1] ; j++){
                arr[j] = arr[j+1];
            }
            arr[j] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {6,4,2,3,1,5};
        InsertionSort.sort(arr);
        for(int e : arr){
            System.out.print(e);
        }
     }

}
