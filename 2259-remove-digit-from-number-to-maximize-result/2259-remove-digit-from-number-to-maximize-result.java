class Solution {
    public String removeDigit(String number, char digit) {
        int ind = 0 ;
        int n = number.length() ;
        for(int i = 0 ; i < n ; i++){
            if(number.charAt(i)==digit){
                ind=i ;
                if(i<n-1 && digit<number.charAt(i+1)) break;
            }
        }
        number = number.substring(0,ind)+number.substring(ind+1) ;
        return number ;
    }
}