class Solution {
    public boolean isAnagram(String s, String t) {
       HashMap<Character , Integer> map = new HashMap<>();
       int n = s.length();
       int m = t.length();
       if(m!=n){
        return false ;
       }
       else{
        int[] arr = new int[26];
        for(int i = 0 ; i<n ;i++){
            arr[s.charAt(i) - 'a']++; // arr[ 'a' - 'a'] means to find the index of the array 
            arr[t.charAt(i) - 'a']--;
        }
        
        for(int i = 0 ; i< arr.length ;i++){
            if(arr[i] != 0){
                return false ;
            }
        }
        return true ;
       }
    }
}