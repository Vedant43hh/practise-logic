class Solution {
    public int[] arrayChange(int[] nums, int[][] operations) {
        HashMap<Integer,Integer> map = new HashMap<>() ;
        for(int i = 0 ; i < nums.length ; i++){
            map.put(nums[i],i) ;
        }
        for(int[] op:operations){
            if(map.containsKey(op[0])){
                int ind = map.get(op[0]);
                nums[map.get(op[0])] = op[1] ;
                map.put(op[1],ind);
            }
        }
        return nums ;
    }
}