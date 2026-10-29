class Solution {
    public int[] leftRightDifference(int[] nums) {
        int right = 0 ;
        for(int num : nums){
            right += num ;
        }

        int left = 0 ;
        int[] res = new int[nums.length] ;

        for(int i = 0 ; i < nums.length ; i++){
            right -= nums[i] ;
            res[i] = Math.abs(left-right) ;
            left += nums[i] ;
        }
        return res ;
    }
}