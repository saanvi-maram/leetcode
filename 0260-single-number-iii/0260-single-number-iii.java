class Solution {
    public int[] singleNumber(int[] nums) {
        int arr[]=new int[2];
        HashMap<Integer,Integer> hm=new HashMap<>();
        int ind=0;
        for(int i:nums)
        hm.put(i,hm.getOrDefault(i,0)+1);
        for(var i:hm.entrySet())
        {
            if(i.getValue()==1){
            arr[ind]=i.getKey(); 
            ind++;
            }
        }
        return arr;
    }
}