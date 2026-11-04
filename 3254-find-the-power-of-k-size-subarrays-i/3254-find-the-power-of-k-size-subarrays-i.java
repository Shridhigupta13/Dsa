class Solution {
    public int[] resultsArray(int[] nums, int k) {
        int n = nums.length;
        int arr []= new int [n-k+1];

        for(int i=0; i<=n-k; i++) {
            Boolean valid = true;
            for(int j=i; j<i+k-1; j++){
                if(nums[j+1] != nums[j]+1){
                    valid =false;
                    break;
                }
            }
            if(valid){
                arr[i]= nums[i + k - 1];
            }
            else{
                arr[i] = -1;
            }
        }
        return arr;
    }
}