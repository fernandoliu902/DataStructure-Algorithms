package InsertionSort;

public class Insertion {
    private  Insertion(){}
    public static void sort(int[] arr){
        for (int i = 1; i < arr.length; i++){
            for (int j = i; j > 0; j--){
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {6,4,2,3,1,5};
        Insertion.sort(arr);
        for (int e: arr) {
            System.out.print(e + " ");
        }
    }

}
