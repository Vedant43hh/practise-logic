class Solution {
    public int findGCD(int[] nums) {
        int mx = Integer.MIN_VALUE ; 
        int mn = Integer.MAX_VALUE ;

        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] < mn){
                mn = nums[i] ;
            }
            if(nums[i] > mx){
                mx = nums[i] ;
            }
        }
        return gcd(mx , mn) ;
    }
    public int gcd(int a , int b){
        while(b!=0){
            int rem = a%b ; 
            a = b ; 
            b = rem ;
        }
        return a ;
    }
}