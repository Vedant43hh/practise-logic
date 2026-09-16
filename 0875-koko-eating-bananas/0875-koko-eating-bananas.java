class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l = 1 ; 
        int r = Arrays.stream(piles).max().getAsInt();;
        int ans = r ;

        while(l<=r){
            int mid = l+(r-l)/2 ;
            if(canEatInTime(piles,h,mid)){
                ans = mid ;
                r = mid-1 ;
            }
            else{
                l = mid+1 ;
            }
        }
        return ans ; 
    }
    public boolean canEatInTime(int[] piles ,int h , int k){
        long hours = 0 ;
        for(int pile : piles){
            int div = pile/k ;
            hours+=div ;
            if(pile%k!=0) hours++;
        }
        return hours<=h ;
    }
}