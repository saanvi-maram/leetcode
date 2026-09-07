class Solution {
    public int[] productExceptSelf(int[] nums) {
        int p[]=new int[nums.length];
        int s[]=new int[nums.length];
        int res[]=new int[nums.length];
        p[0]=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            p[i]=nums[i]*p[i-1];
        }
        s[nums.length-1]=nums[nums.length-1];
        for(int i=nums.length-2;i>=0;i--)
        {
          s[i]=nums[i]*s[i+1];
         // System.out.print(s[i]+" ");
        }
        res[0]=s[1];
        res[nums.length-1]=p[nums.length-2];
        for(int i=1;i<nums.length-1;i++)
        {
            res[i]=p[i-1]*s[i+1];
        }
        return res;
    }
}