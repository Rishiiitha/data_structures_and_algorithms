class Solution {
    public int trap(int[] height) {
        int maxv=0;
        int left=0,right=0;
        int n=height.length;
        int v=0;
        while(left<=right && right<n){
            int k=right-1;
            while(k>left){
                int water=Math.min(height[left],height[right]);
                if(water-height[k]>0){maxv+=water-height[k];height[k]+=water-height[k];}
                k--;
            }
            //System.out.println(left+" "+right+" "+v);
            if(height[left]<height[right])left++;
            else right++;
        }
        return maxv;
    }
}