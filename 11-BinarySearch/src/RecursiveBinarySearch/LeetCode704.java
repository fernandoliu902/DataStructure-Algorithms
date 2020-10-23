package RecursiveBinarySearch;
//Given a sorted (in ascending order) integer array nums of n elements and a target value, write a function to search target in nums. If target exists, then return its index, otherwise return -1.
//
//
//Example 1:
//
//Input: nums = [-1,0,3,5,9,12], target = 9
//Output: 4
//Explanation: 9 exists in nums and its index is 4
public class LeetCode704 {
    public int search(int[] nums, int target) {

        return search(nums, 0, nums.length - 1, target);
    }

    private int search(int[] nums, int l, int r, int target){

        if(l > r) return -1;

        int mid = l + (r - l) / 2;
        if(nums[mid] == target)
            return mid;

        if(nums[mid] < target)
            return search(nums, mid + 1, r, target);

        return search(nums, l, mid - 1, target);
    }
}
