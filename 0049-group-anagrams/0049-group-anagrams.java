class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String , List<String>> map = new HashMap<>() ;
        for(String s : strs){
            char[] chars = s.toCharArray();
            Arrays.sort(chars) ;
            String newWord = new String(chars);
            if(!map.containsKey(newWord)){
                map.put(newWord ,new ArrayList<>());
            }
            map.get(newWord).add(s);
        }
        return new ArrayList<>(map.values());
    }
}