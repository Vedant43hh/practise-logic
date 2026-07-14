class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> list = new ArrayList<>() ; 

        String s = "123456789" ; 
        String l = String.valueOf(low) ;
        String h = String.valueOf(high) ; 

        for(int i = l.length() ; i <= h.length() ; i++){
            for(int st = 0 ; st <= 9-i ; st++){
                int num = Integer.parseInt(s.substring(st , st+i)) ;
                if(num>=low && num<=high){
                    list.add(num) ;
                }
            }
        }
        return list ; 
    }
}