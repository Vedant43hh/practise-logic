class Solution {
    public String maxSumOfSquares(int num, int sum) {
        if(sum>9*num) return "" ;
        int nine = sum/9 ;
        int rest = sum%9 ;
        return ("9".repeat(nine) + rest + "0".repeat(num)).substring(0,num) ;

    }
}