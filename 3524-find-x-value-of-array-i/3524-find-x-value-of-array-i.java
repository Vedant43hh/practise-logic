class Solution {
    public long[] resultArray(int[] nums, int k) {
        long[] res = new long[k] ;
        int[] freq = new int[k] ;

        for(int num : nums){
            num = num%k ;
            int[] curr = new int[k] ;
            curr[num] = 1 ;
            for(int i = 0 ; i < k ; i++){
                curr[i*num%k] += freq[i] ;
            }
            freq = curr ;
            for(int i = 0 ; i < k ; i++){
                res[i] += freq[i] ;
            }
        }
        return res ;
    }
}