package MoreAboutBinarySearch.upper;
//查找大于target的最小值
public class BinarySearch {
    public static int find(int[] arr, int target){
        int l = 0;
        int r = arr.length;
        while(l < r){
            int mid = (l + r)/2;
            if(arr[mid] > target)
                r = mid;
            if(arr[mid] <= target)
                l = mid + 1;
        }
        return target >= arr[arr.length - 1] ? arr[arr.length - 1] : arr[l];
    }

    public static void main(String[] args) {
        int[] nums = {23, 56, 65, 69, 72, 89, 96, 99};
        System.out.println(find(nums,1));
    }
}
