class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> list = new ArrayList<>() ;
        Arrays.sort(nums) ;
        int curr = nums[0] ; 

        for(int i = 0 ; i < nums.length ;curr++ , i++){
            if(curr < nums[i]){
                list.add(curr) ;
                i-- ;
            }
        }
        return list ;
    }
}