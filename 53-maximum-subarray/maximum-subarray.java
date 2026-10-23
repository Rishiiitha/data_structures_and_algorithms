class Solution {
    public int maxSubArray(int[] nums) {
        int right=0,n=nums.length,curr=0,max=Integer.MIN_VALUE;
        while(right<n){
            curr+=nums[right];
            max=Math.max(max,curr);
            if(curr<0)curr=0;
            right++;
        }
        return max;
    }
}