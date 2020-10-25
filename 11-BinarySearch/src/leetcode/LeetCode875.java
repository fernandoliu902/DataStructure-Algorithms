package leetcode;
/*
Koko loves to eat bananas.  There are N piles of bananas, the i-th pile has piles[i] bananas.  The guards have gone and will come back in H hours.

Koko can decide her bananas-per-hour eating speed of K.  Each hour, she chooses some pile of bananas, and eats K bananas from that pile.  If the pile has less than K bananas, she eats all of them instead, and won't eat any more bananas during this hour.

Koko likes to eat slowly, but still wants to finish eating all the bananas before the guards come back.

Return the minimum integer K such that she can eat all the bananas within H hours.



Example 1:

Input: piles = [3,6,7,11], H = 8
Output: 4
Example 2:

Input: piles = [30,11,23,4,20], H = 5
Output: 30
Example 3:

Input: piles = [30,11,23,4,20], H = 6
Output: 23
 */
import java.util.Arrays;

public class LeetCode875 {
    public static int minEatingSpeed(int[] piles, int H) {
        //确定搜索边界
        //最少一个小时一根香蕉
        int l = 1;
        //最多一个小时piles中最大值香蕉
        int r = Arrays.stream(piles).max().getAsInt();
        while(l < r){
            int mid = (l + r) / 2;
            if(eatingTime(piles, mid) <= H)
                r = mid;
            else
                l = mid + 1;
        }
        return l;
    }

    public static int eatingTime(int[] piles, int k){
        int time = 0;
        for (int i = 0; i < piles.length; i++) {
            time += piles[i] / k + (piles[i] % k > 0 ? 1 : 0);
        }
        return time;
    }

    public static void main(String[] args) {
        int[] piles = {3, 6, 7, 11};
        int H = 8;
        System.out.println(minEatingSpeed(piles,H));
    }
}
