class Solution {
    public int minAddToMakeValid(String s) {
        int n = s.length() ;
        int count = 0 ;
        int add = 0 ;
        for(int i = 0 ; i < n ; i++){
            if(s.charAt(i) == '('){
                count++;
            }else{
                if(count>0){
                    count-- ;
                }else{
                    add++;
                }
            }
        }
        return add+count ;
    }
}