class Solution {
    final int mod = 1000000007; 
    public int xorAfterQueries(int[] nums, int[][] queries) {
        for(int[] t : queries){
            int l = t[0] ;
            int r = t[1] ;
            int k = t[2] ;
            int v = t[3] ;
            int ind = l ; 

            while(ind<=r){
                long temp = nums[ind] ;
                nums[ind] = (int)((temp*v)%mod) ;
                ind += k ;
            }
        }
        int ans = 0 ;
        for(int num : nums){
            ans^=num; 
        }
        return ans ;
    }
}