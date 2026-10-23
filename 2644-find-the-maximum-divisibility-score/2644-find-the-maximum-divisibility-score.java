class Solution {
    public int maxDivScore(int[] nums, int[] divisors) {
        int n = nums.length;
        int m = divisors.length;
        Arrays.sort(divisors);
        int maxi = 0;
        int res = divisors[0];
        for(int i=0;i<m;i++)
        {
            int count=0;
            for(int j=0;j<n;j++)
            {
                if(nums[j]%divisors[i]==0)count++;
            }
            if(count > maxi)
            {
                maxi = count;
                res = divisors[i];
            }
        }
        return res;

    }
}