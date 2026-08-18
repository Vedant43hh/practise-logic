class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length ;
        int[] hash = new int[n+1];
        for(int i = 0 ; i < n ; i++){
            hash[nums[i]] = 1 ;;
        }
        int ans = 0 ;
        for(int i = 0 ; i < hash.length ; i++){
            if(hash[i] == 0){
                ans = i ;
            }
        }
        return ans ;
    }
}