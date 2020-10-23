package MoreAboutBinarySearch.lower.floor;

import MoreAboutBinarySearch.lower.BinarySearch;

public class LowerFloor {

    // < target ，返回最大值索引
    // == target，返回最小索引
    public static int lowerFloor(int[] arr, int target) {
        int l = BinarySearch.lower(arr, target);
        if(l + 1<arr.length && arr[l+1] == target)
            return l + 1;
        return l;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 3, 3, 5, 5};

        System.out.print("lower_floor : ");
        for(int i = 0; i <= 6; i ++)
            System.out.print(LowerFloor.lowerFloor(arr, i) + " ");
        System.out.println();
    }
}
