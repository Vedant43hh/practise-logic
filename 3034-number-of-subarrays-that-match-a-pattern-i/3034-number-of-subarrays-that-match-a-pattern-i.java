class Solution {
    public int countMatchingSubarrays(int[] nums, int[] pattern) {
        int count = 0 ;

        for(int i = 0 ; i+pattern.length < nums.length ; i++){
            boolean match = true ;
            for(int j = 0 ; j < pattern.length ; j++){
                int num ; 
                if(nums[i+j+1] > nums[i+j]){
                    num = 1 ;
                }else if(nums[i+j+1] == nums[i+j]){
                    num = 0 ;
                }else{
                    num = -1 ;
                }

                if(num!=pattern[j]){
                    match = false ;
                    break ;
                }
            }
            if(match){
                count++;
            }
        }
        return count ;

    }
}