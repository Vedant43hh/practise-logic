class Solution {
    public List<String> generateParenthesis(int n) {
        ArrayList<String> list = new ArrayList<>() ;
        helper(list , 0 , 0 , "" , n) ;
        return list ;
    }
    public void helper(ArrayList<String> list , int l , int r , String s , int n){
        if(s.length() == n*2){
            list.add(s);
            return ;
        }
        if(l<n){
            helper(list , l+1 , r , s+"(" , n);
        }
        if(r<l){
            helper(list , l , r+1 , s+")" , n) ;
        }
    }
}