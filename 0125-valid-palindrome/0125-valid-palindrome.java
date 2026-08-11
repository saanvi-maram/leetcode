class Solution {
    public boolean isPalindrome(String s) {
        String s1=s.replaceAll("[^a-zA-Z0-9]","");
        String str=s1.toLowerCase();
        int p1=0,p2=str.length()-1;
        boolean flag=true;
      //  if(str.length()==1){
        //flag=false;
       // break;
       // }
        //else{
        while(p1<=p2)
        {
           
          if(str.charAt(p1)!=str.charAt(p2))
            {
                flag=false;
            break;
           
            }
      
            else
            {
                p2--;
                p1++;
            }
        }
      //  }
        return flag;
    }
}