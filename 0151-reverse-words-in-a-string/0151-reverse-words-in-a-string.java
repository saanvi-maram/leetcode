class Solution {
    public String reverseWords(String s) {
        String arr[]=new String[1000000];
        arr=s.trim().split("\\s+");
        String []a1=new String[arr.length];
       // arr=s.split(" ");
        int j=0;
        for(int i=arr.length-1;i>=0;i--)
        {
            a1[j]=arr[i];
            j++;
        } 
        String str= String.join(" ",a1);
        return str;
    }
}