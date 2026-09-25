class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int left=0,n=arr.length,right=n-1;
        int peak=0;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(mid+1<n && arr[mid]>arr[mid+1]){peak=mid;right=mid-1;}
            else left=mid+1;
        }
        return peak;
    }
}