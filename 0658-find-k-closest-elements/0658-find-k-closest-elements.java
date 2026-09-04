class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int st = 0 ; 
        int end = arr.length-1 ; 
        while(end-st >= k){
            if(Math.abs(arr[st]-x) > Math.abs(arr[end]-x)){
                st++;
            }else{
                end--;
            }
        }
        List<Integer> res = new ArrayList<>() ;
        for(int i = st ; i <= end ; i++){
            res.add(arr[i]);
        }
        return res ;
    }
}