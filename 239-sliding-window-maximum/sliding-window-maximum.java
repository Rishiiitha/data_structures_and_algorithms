import java.util.*;
class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer>q=new ArrayDeque<>();
        int []res=new int[nums.length-k+1];
        for(int i=0;i<k;i++){
           while(!q.isEmpty() && nums[q.peekLast()]<nums[i])q.removeLast();
            q.addLast(i);
        }
        int z=0;
        res[z++]=nums[q.peekFirst()];
        for(int i=k;i<nums.length;i++){
           while(!q.isEmpty() && nums[q.peekLast()]<nums[i])q.removeLast();
           q.addLast(i);
           while(q.peekFirst()<=i-k)q.pollFirst();
           res[z++]=nums[q.peekFirst()];
        }
        return res;
    }
}