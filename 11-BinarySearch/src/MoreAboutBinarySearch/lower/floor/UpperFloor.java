package MoreAboutBinarySearch.lower.floor;

public class UpperFloor {
    public static int upperFloor(int[] arr, int target) {
        int l = -1;
        int r = arr.length - 1;
        while (l < r) {
            int mid = l + (r - l + 1) / 2;
            // 请同学们根据下面的搜索范围的调整逻辑思考：
            // 为什么 upper_floor 同样需要使用上取整的方式来计算 mid?

            // 在 lower 中，这里是 data[mid].compareTo(target) < 0
            // 但是，对于 upper_floor 来说，在 data[mid] == target 的时候，有可能是解
            // 所以在等于的情况下，不能排除掉 data[mid] 的值，我们的搜索空间的变化，同样是 l = mid
            if(arr[mid] <= target)
                l = mid;
            else
                r = mid - 1;
        }
        return l;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 3, 3, 5, 5};
        System.out.print("upper_floor : ");
        for(int i = 0; i <= 6; i ++)
            System.out.print(UpperFloor.upperFloor(arr, i) + " ");
        System.out.println();
    }
}
