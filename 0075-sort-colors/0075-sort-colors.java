class Solution {
    public void sortColors(int[] nums) {
        ms(nums,0,nums.length-1);
        return;
    }
    public static void ms(int nums[],int low,int high)
    {
        if(low>=high) return;
        int mid=(low+high)/2;
        ms(nums,low,mid);
        ms(nums,mid+1,high);
        mergesort(nums,low,mid,high);
    }
    public static void mergesort(int nums[],int low,int mid,int high)
    {
        int p1=low;
        int p2=mid+1;
        int size=high-low+1;
        int temp[]=new int[size];
        int index=0;
        while(p1<=mid && p2<=high)
        {
            if(nums[p1]<nums[p2])
            {
                temp[index]=nums[p1];
                index++;
                p1++;
            }
            else
            {
                temp[index]=nums[p2];
                index++;
                p2++;
            }
        }
            while(p1<=mid)
            {
                temp[index++]=nums[p1++];
            }
            while(p2<=high)
            temp[index++]=nums[p2++];
        
        for(int i=0;i<size;i++)
        nums[i+low]=temp[i];
    }
}