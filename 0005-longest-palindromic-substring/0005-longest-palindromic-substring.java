class Solution {
    
    public String longestPalindrome(String s) {
        if(s.length() <= 1){
            return s ;
        }
        int max = 1 ;
        String maxstr = s.substring(0,1) ;

        for(int i = 0 ; i < s.length() ; i++){
            for(int j = i+max ; j <= s.length() ; j++){
                if(j-i > max && isPalindrome(s.substring(i,j))){
                    max = j-i ; 
                    maxstr = s.substring(i , j) ;
                }
            }
        }
        return maxstr ; 
    }
    public boolean isPalindrome(String str){
        int left = 0 ; 
        int right = str.length()-1 ;
        while(left<right){
            if(str.charAt(left) != str.charAt(right)){
                return false ;
            }
            left++; 
            right--;
        }
        return true ; 
    }
}