class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        return helper(nums,target,0,0) ;
    }
    public int helper(int[] arr , int target , int ind , int sum){
        if(ind>=arr.length) return sum==target?1:0 ;
        int sub = helper(arr,target,ind+1 , sum-arr[ind]) ;
        int add = helper(arr,target,ind+1,sum+arr[ind]) ;
        return sub+add ;

    }
}