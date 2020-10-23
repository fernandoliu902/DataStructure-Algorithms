package leetcode;

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
