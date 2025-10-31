class Solution {
    public int pivotIndex(int[] nums) {
        int pre[]=new int[nums.length];
        int suff[]=new int[nums.length];
        pre[0]=0;
        suff[nums.length-1]=0;
        int suffix=0;int prefix=0;
        for(int i=1;i<nums.length;i++)
        {
            suffix=suffix+nums[i-1];
            suff[i]=suffix;
        }
        for(int i=nums.length-2;i>=0;i--)
        {
            prefix=prefix+nums[i+1];
            pre[i]=prefix;
        }
        for(int i=0;i<nums.length;i++)
        {
            if(pre[i]==suff[i])
            {
                return i;
            }
        }
        return -1;
    }
}