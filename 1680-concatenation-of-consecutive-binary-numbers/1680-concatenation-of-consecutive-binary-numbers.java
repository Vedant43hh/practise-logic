class Solution {
    public int concatenatedBinary(int n) {
        String s = "";
        StringBuilder sb = new StringBuilder() ;
        for(int i = 1 ; i <= n ; i++){
            sb.append(Integer.toBinaryString(i));
        }
        long res = 0 ; 
        long mod = 1000000007 ;
        for(int i = 0 ; i < sb.length() ; i++){
            res = (res*2 + (sb.charAt(i) - '0')) % mod ; 
        }
        return (int) res ;
        
    }
}