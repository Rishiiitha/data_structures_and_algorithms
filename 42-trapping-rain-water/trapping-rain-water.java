class Solution {
    public int trap(int[] height) {
        int maxv=0;
        int left=0;
        int n=height.length,right=n-1;
        int maxh=0;
        int lm=height[0],rm=height[n-1];
        while(left<right && right>0){
            lm=Math.max(height[left],lm);
            rm=Math.max(height[right],rm);
            int water=Math.min(lm,rm);
            if(height[left]<water){maxv+=water-height[left];
            height[left]+=water-height[left];}
            if(height[right]<water){
                maxv+=water-height[right];
                height[right]+=water-height[right];
            }
            //if(height[right]<=maxh)maxv-=
            //System.out.println(maxv+" "+left+" "+right);
            if(height[left]<height[right])left++;
            else right--;
        }
        return maxv;
    }
}