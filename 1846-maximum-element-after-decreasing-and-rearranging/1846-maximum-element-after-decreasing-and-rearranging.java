class Solution {
    public int maximumElementAfterDecrementingAndRearranging(int[] arr) {
        int n = arr.length ;
        int[] count = new int[n+1] ; 
        for(int i = 0 ; i < n ; i++){
            count[Math.min(arr[i],n)]++;
        }

        int val = 0 ;
        for(int i = 1 ; i <= n ; i++){
            val = Math.min(i,count[i]+val) ; 
        }
        return val ; 

    }
}