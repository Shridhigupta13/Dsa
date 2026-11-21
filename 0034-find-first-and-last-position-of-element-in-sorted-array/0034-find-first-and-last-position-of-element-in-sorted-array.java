class Solution {
    public int[] searchRange(int[] arr, int target) {
        int n = arr.length;
        int lo = 0;
        int hi = n-1;
        int firstidx = -1;
        while(lo <= hi){
            int mid = (lo+hi)/2;
            if(arr[mid] < target){
                lo = mid + 1;
            }
            else{
                if(arr[mid] == target){
                  firstidx = mid;  
                }
                hi = mid -1;
            }
        }
        lo = 0;
        hi = n-1;
        int lastidx = -1;
        while(lo <= hi){
            int mid = (lo+hi)/2;
            if(arr[mid] > target){
               hi = mid -1;
            }
            else{
                if(arr[mid] == target){
                  lastidx = mid;  
                }
                lo = mid + 1;
            }
        }
        int [] nums = new int [2];
        nums[0] = firstidx;
        nums[1] = lastidx;
        return nums;

    }
}