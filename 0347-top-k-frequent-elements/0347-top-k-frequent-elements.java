class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        TreeMap<Integer,Integer> tm=new TreeMap<>();
      
        for(int i=0;i<nums.length;i++)
        {
            tm.put(nums[i],tm.getOrDefault(nums[i],0)+1);
        }
        List<Map.Entry<Integer,Integer>> al=new ArrayList<>(tm.entrySet());
        int arr[]=new int[k];
        al.sort((a,b)-> b.getValue()-a.getValue());
        for(int i=0;i<k;i++)
        {
            arr[i]=al.get(i).getKey();
        }
    
        return arr;
    }
}