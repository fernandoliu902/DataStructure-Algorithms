package generic;

public class SelectGenerics {
    //使用泛型时要注意 为确保可比性要继承comparable 类
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

        Integer[] arr = {1, 4, 2, 3, 6, 5};
        SelectGenerics.sort(arr);
        for(int e: arr)
            System.out.print(e + " ");
        System.out.println();
    }
}
