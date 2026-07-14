import java.math.*;
class Solution {
    public String addBinary(String a, String b) {
        BigInteger n=new BigInteger(a,2);
        BigInteger m=new BigInteger(b,2);
        BigInteger res=n.add(m);
        String str=res.toString(2);
        return str; 
    }
}