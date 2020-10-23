/*
Given an integer array nums, find the sum of the elements between indices i and j (i ≤ j), inclusive.

Example:

Given nums = [-2, 0, 3, -5, 2, -1]

sumRange(0, 2) -> 1
sumRange(2, 5) -> -1
sumRange(0, 5) -> -3
 */

public class LeetCode307 {
    private SegmentTree<Integer> segTree;
    public LeetCode307(int[] nums) {

        if(nums.length != 0){
            Integer[] data = new Integer[nums.length];
            for(int i = 0 ; i < nums.length ; i ++)
                data[i] = nums[i];
            segTree = new SegmentTree<>(data, (a, b) -> a + b);
        }
    }

    public void update(int i, int val) {
        if(segTree == null)
            throw new IllegalArgumentException("Error");
        segTree.set(i, val);
    }

    public int sumRange(int i, int j) {
        if(segTree == null)
            throw new IllegalArgumentException("Error");
        return segTree.query(i, j);
    }
}
