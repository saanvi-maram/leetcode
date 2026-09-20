class Solution {
    public int maxArea(int[] height) {
        int p1=0,p2=height.length-1;
        int w=0,c=0;
        while(p1<p2)
        {
            c=Math.min(height[p1],height[p2])*(p2-p1);
            if(c>w)
            w=c;
       
        if(height[p1]<height[p2])
        {
            p1++;
        }
        else
        p2--;
    
      
        }
    
    return w;
    }
}