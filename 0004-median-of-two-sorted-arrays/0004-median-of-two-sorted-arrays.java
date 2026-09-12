class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length ;
        int m = nums2.length ;
        int[] arr = new int[n+m];
        int i = 0 ;
        int j = 0 ;
        int k = 0 ;
        while(i<n && j<m){
            if(nums1[i] < nums2[j]){
                arr[k] = nums1[i];
                i++;
                k++;
            }
            else{
                arr[k] = nums2[j];
                j++;
                k++;
            }
        }
        while(i<n){
            arr[k] = nums1[i];
            k++;
            i++;
        }
        while(j<m){
            arr[k] = nums2[j];
            k++;
            j++;
        }
        double med ;
        int s = arr.length-1;

        if(arr.length%2==0){
            med = (arr[s/2] + arr[(s/2)+1]);
            med = med/2 ;
        }
        else{
            med = arr[s/2];
           
        }
        return med ;

    }
}