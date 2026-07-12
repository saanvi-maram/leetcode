class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int a=nums1.length+nums2.length;
        int res[]=new int[a];
        double ans;
        int p1=0;
        int p2=0;
        int i=0;
       while(p1<nums1.length && p2<nums2.length)
        {
            if(nums1[p1]<=nums2[p2])
            {
              res[i]=nums1[p1];
              p1++;
              i++;
            }
            else
            {
                res[i]=nums2[p2];
                p2++;
                i++;
            }
        }
        while(p1<nums1.length)
        {
            res[i++]=nums1[p1++];
        }
        while(p2<nums2.length)
        {
            res[i++]=nums2[p2++];
        }
        if((res.length &1)==0)
        {
           ans=(res[res.length/2 -1]+ res[res.length/2])/2.0;
        }
        else
        {
            ans= res[res.length/2];
        }
        return ans;
        
    }
}