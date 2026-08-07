class Solution {
    public int maxChunksToSorted(int[] arr) {
        int runningsum = 0 ;
        int expectedsum = 0 ;
        int chunks = 0 ;
        for(int i = 0 ; i < arr.length ; i++){
            runningsum += arr[i] ;
            expectedsum += i ;
            if(runningsum == expectedsum) chunks++;
        }
        return chunks ;
    }
}