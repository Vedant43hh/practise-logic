class Solution {
    public int averageValue(int[] nums) {
        int n = nums.length ;
        ArrayList<Integer> list = new ArrayList<>() ;
        for(int i = 0 ; i < n ; i++){
            if(nums[i]%2==0 && nums[i]%3==0){
                list.add(nums[i]);
            }
        }

        int sum = 0 ; 
        int avg = 0 ;
        if(list.size() != 0){
            for(int a : list){
                sum += a ;
            }
            avg = sum/list.size() ;
        }
        return avg ;
    }
}