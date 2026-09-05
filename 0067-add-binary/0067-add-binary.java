class Solution {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder() ;
        int carr = 0 ;
        int i = a.length()-1 ;
        int j = b.length()-1 ;

        while(i>=0 || j>=0 || carr == 1){
            if(i>=0){
                carr += a.charAt(i) - '0' ;
            }
            if(j>=0){
                carr += b.charAt(j) - '0' ;
            }
            sb.append(carr%2) ;
            carr /= 2 ;
            i--;
            j--;
        }
        return sb.reverse().toString() ;
    }
}