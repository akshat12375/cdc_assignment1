class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums2);
        Set<Integer>hash=new HashSet<>();
        for(int i=0;i<nums1.length;i++)
        {
            if(search(nums2,nums1[i]))
            {
                hash.add(nums1[i]);
            }
        }
        int ar[]=new int [hash.size()];
        int c=0;
        for(int it:hash)
        {
            ar[c++]=it;
        }
        return ar;
    }
    public boolean search(int ar[],int target)
    {
        int l=0;
        int u=ar.length-1;
        while(l<=u)
        {
            int mid=(l+u)/2;
            if(ar[mid]==target)
            {
                return true;
            }
            if(ar[mid]<target)
            {
                l=mid+1;
            }
            else{
                u=mid-1;
            }
            
        }
        return false;
    }
}