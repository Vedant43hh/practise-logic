class Solution {
    public int lastRemaining(int n) {
        int left = 1 ;
        int right = n ;
        int step = 1 ;
        boolean leftside = true ;

        while(left < right){
            int num = (right-left)/step+1 ;
            if(leftside){
                left += step ;
                if(num%2 == 1) right-=step ;
            }else{
                right -= step ;
                if(num%2 == 1) left+=step ;
            }
            leftside =!leftside ;
            step*=2 ;
        }
        return left ;
    }
}