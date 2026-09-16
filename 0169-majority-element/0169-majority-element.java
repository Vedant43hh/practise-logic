class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer , Integer> map = new HashMap<>() ;
        int res = 0 ;
        int majority = 0 ;
        for(int num : nums){
            map.put(num , map.getOrDefault(num,0)+1) ;
            if(map.get(num) > majority){
                majority = map.get(num) ;
                res = num ;
            }
        }
        return res ;
    }
}