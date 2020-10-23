package priorityqueue;
import java.util.PriorityQueue;

public class LeetCode215 {
    public static int findKthLargest(int[] nums, int k) {
        PriorityQueue heap = new PriorityQueue();
        for(int i = 0; i<nums.length;i++){
            heap.add(nums[i]);
            if(heap.size()>k){
                heap.poll();
            }
        }
        return (int)heap.peek();
    }

    public static void main(String[] args) {
        int[] arr = {3, 2, 5, 3, 1, 2, 4, 5, 6};
        int ans = findKthLargest(arr, 4);
        System.out.println();
    }
}

