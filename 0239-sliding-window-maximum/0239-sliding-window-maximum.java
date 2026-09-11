class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if(k==1) return nums ;
        int[] arr = new int[nums.length-k+1] ;
        int ind = 0 ;
        int max = Integer.MIN_VALUE ;
        // find k window max 
        for(int i = 0 ; i < k ; i++){
            max = Math.max(nums[i] , max) ;
        }
        arr[ind++] = max ;
        // now increase the window by k 
        for(int i = 1 ; i <= nums.length-k ; i++){
            // check for the next element if it is maximum or not 
            if(nums[i+k-1] > max){
                max = nums[i+k-1] ;
                arr[ind++] = max ;
                continue ;
            }
            // check if current element is still maximum for that window or not 
            if(nums[i] == max){
                arr[ind++] = max ;
                continue ; 
            }

            // check if the maximum element remoived from the window so recalculating the maximum 
            if(nums[i-1] == max){
                max = Integer.MIN_VALUE ;
                for(int j = 0 ; j < k ; j++){
                    max = Math.max(nums[i+j] , max) ;
                }
                arr[ind++] = max ;
            }else{
                arr[ind++] = max ;
            }
        }
        return arr ;
    }
}