package MoreAboutBinarySearch.ceil;

public class BinarySearch {
    public static int upper(int[] arr, int target){
        int l = 0;
        int r = arr.length;
        while(l < r){
            int mid = (l + r) / 2;
            if(arr[mid] <= target){
                l = mid + 1;
            }else{
                r = mid;
            }
        }
        return l;
    }

    public static int ceil(int[] arr, int target) {
        int u = upper(arr, target);
        if (u - 1 >= 0 && arr[u - 1] == target) {
            return u - 1;
        }
        return u;
    }

    public static int lowerCeil(int[] arr, int target){
        int l = 0;
        int r = arr.length;
        while (l < r) {
            int mid = (l + r) / 2;
            if(arr[mid] < target)
                l = mid + 1;
            else
                r = mid;
        }
        return l;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 3, 3, 5, 5};
        for (int i = 0; i <= 6; i++) {
            System.out.print(BinarySearch.lowerCeil(nums,i) + " ");
        }
        System.out.println();
    }
}
