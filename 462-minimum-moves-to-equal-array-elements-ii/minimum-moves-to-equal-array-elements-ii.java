class Solution {
    public int minMoves2(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        long s1=0;int mid=0;
        mid=nums[(n)/2];
        for(int i=0;i<n;i++){
            s1+=Math.abs((long)nums[i]-mid);
        }
        return (int)s1;
    }
}