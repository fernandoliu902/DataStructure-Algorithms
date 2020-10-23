package MoreAboutBinarySearch.lower;

public class BinarySearch {
    //查找 小于target的最大索引
    public static int lower(int[] arr, int target){
        int l = -1 ;
        int r = arr.length - 1;
        //在arr[l.r] 中寻找解
        while (l < r){
            //System.out.println(l + " " + r);
            int mid = l+(r-l+1) / 2;
            if(arr[mid] < target)
                l = mid;
            if(arr[mid] >= target){
                r = mid - 1;
            }
        }
        return l;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 3, 3, 5, 5};
        System.out.println(BinarySearch.lower(arr,2));
//        for (int i = 0; i <= 6; i++) {
//            System.out.println(BinarySearch.lower(arr,i) + " ");
//        }
//        System.out.println();
    }
}
