class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n = nums.length ;
        long[] ans = new long[nums.length] ;
        for(int i = 0 ; i < ans.length ; i++){
            ans[i] = (long) nums[i]*nums[i] ;
        }
        Arrays.sort(ans) ;
        long sum = 0 ; 
        int k = nums.length/2 ;
        for(int i = 0 ; i < k ; i++){
            sum -= ans[i] ;
        }
        for(int i = k ; i < nums.length ; i++){
            sum += ans[i] ;
        }
        return sum ;
    }
}