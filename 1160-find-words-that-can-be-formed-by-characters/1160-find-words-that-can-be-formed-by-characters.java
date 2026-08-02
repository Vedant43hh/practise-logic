class Solution {
    public int countCharacters(String[] words, String chars) {
        int sum = 0 ; 
        HashMap<Character , Integer> map = new HashMap<>() ; 
        for(char ch : chars.toCharArray()){
            map.put(ch , map.getOrDefault(ch,0) + 1) ;
        }
        for(int i = 0 ; i < words.length ; i++){
            String word = words[i] ;

            HashMap<Character , Integer> temp = new HashMap<>(map) ;
            boolean isGood = true ;
            for(char ch : word.toCharArray()){
                if(temp.getOrDefault(ch,0) == 0){
                    isGood = false ;
                    break ;
                }else{
                    temp.put(ch , temp.getOrDefault(ch,0)-1) ;
                };
            }
            if(isGood){
                sum+=word.length() ;
            }
        }
        return sum ;
    } 
}