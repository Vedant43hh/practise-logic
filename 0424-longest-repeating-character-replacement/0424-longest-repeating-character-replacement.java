class Solution {
    public int characterReplacement(String s, int k) {
        int ans = 0 ;
        int n = s.length() ; 
        for(char c = 'A' ; c <= 'Z' ; c++){
            int i = 0 ; 
            int j = 0 ;
            int count = 0 ;
            while(j<n){
                if(s.charAt(j) == c){
                    j++;
                }else if(count < k){
                    j++;
                    count++ ;
                }else if(s.charAt(i) == c){
                    i++;
                }else{
                    i++;
                    count-- ;
                }
                ans = Math.max(ans , j-i) ;
            }
        }
        return ans ;
    }
}