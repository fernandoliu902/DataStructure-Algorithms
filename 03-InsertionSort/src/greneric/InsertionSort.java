package greneric;

public class InsertionSort {
    private InsertionSort(){}
    public static <E extends  Comparable<E>> void sort(E[] arr){
        for(int i = 0; i < arr.length; i++){
            for (int j = i; j > 0; j--){
                if(arr[j].compareTo(arr[j-1])<0){
                    E temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Integer[] arr = {6,4,2,3,1,5};
        InsertionSort.sort(arr);
        for (Integer e : arr) {
            System.out.println(e);
        }
    }
}
