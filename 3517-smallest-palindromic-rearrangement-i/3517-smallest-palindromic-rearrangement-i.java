class Solution {
    public String smallestPalindrome(String s) {
        int n = s.length() ;
        char[] first = s.substring(0,n/2).toCharArray() ;
        Arrays.sort(first) ;
        String res = new String(first) + ((n & 1) == 1 ? s.charAt(n / 2) : "") + new StringBuilder(new String(first)).reverse()  ;
        return res ;

    }
}