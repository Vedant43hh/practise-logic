class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int[] hash = new int[nums.length];
        
        List<Integer> list = new ArrayList<>();
        for(int i = 0 ; i < nums.length ; i++){
            hash[nums[i]-1]++;
        }
        for(int i = 0 ; i < hash.length ; i++){
            if(hash[i] == 0){
                list.add(i+1);
            }
        }

        return list ;
    }
}