class Solution {
    public double myPow(double x, int n) {
        double ans=1;
        long n1=n;
      //  double r=x;
        if(n==0) return 1;
        if(n1<0){
        x=1/x;
        n1=-n1;
        }
double r=x;
        while(n1>0)
        {
            if((n1&1)==1)
            ans=(ans*r);
            r=(r*r);
            n1=n1>>1;
        }
        return ans;

        
    }
}