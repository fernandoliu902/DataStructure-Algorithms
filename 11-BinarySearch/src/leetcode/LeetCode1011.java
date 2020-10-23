package leetcode;

public class LeetCode1011 {
    public static int shipWithinDays(int[] weights, int D) {
        int l = 0;
        for (int i = 0; i < weights.length ; i++) {
            l = Math.max(l, weights[i]);
        }
        int r = 0;
        for (int i = 0; i <weights.length ; i++)
            r += weights[i];

        while(l < r){
            int mid = (l + r) / 2;
            if(days(weights, mid) <= D)
                r = mid;
            else
                l = mid + 1;
        }
        return  l;
    }

    private static int days(int[] weights, int k){
        int cur = 0;
        int res = 0;
        for (int weight: weights) {
            if(cur + weight <= k)
                cur += weight;
            else {
                res++;
                cur = weight;
            }
        }
        res ++;
        return res;
    }

    public static void main(String[] args) {
        int[] weights = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int D = 5;
        System.out.println(
                shipWithinDays(weights, D)
        );
    }
}
