class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        int a=0;
        for(int i:nums)
        hm.put(i,hm.getOrDefault(i,0)+1);
        for(var i:hm.entrySet())
        {
            if(i.getValue()==1)
            a=i.getKey();

        }
        return a;
    }
}