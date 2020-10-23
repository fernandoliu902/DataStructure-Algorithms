package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/*
Given two arrays, write a function to compute their intersection.

Example 1:

Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2,2]
Example 2:

Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [4,9]
 */
public class LeetCode350 {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int num : nums1){
            if (map.containsKey(num))
                map.put(num, map.get(num) + 1);
            else
                map.put(num, 1);
        }

        ArrayList<Integer> list = new ArrayList<>();
        for (int num : nums2){
            if(map.containsKey(num)){
                list.add(num);
                map.put(num, map.get(num) - 1);
                if(map.get(num) == 0)
                    map.remove(num);
            }
        }
        int[] ans = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }
        return ans;
    }
}
