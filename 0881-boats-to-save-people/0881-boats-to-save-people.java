class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int p1=0,p2=people.length-1,cnt=0;
        while(p1<=p2)
        {
            if(people[p1]+people[p2]<=limit)
            {
                cnt++;
              //  p1+=2;
                p2--;
                p1++;
            }
            else
            {

               cnt++;
                p2--;

            }
            //cnt++;
        }
        return cnt;
    }
}