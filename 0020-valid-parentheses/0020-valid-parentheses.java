class Solution {
    public boolean isValid(String s) {
        boolean flag=true;
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='('||s.charAt(i)=='{'||s.charAt(i)=='[')
            st.push(s.charAt(i));
            else if(s.charAt(i)==')'||s.charAt(i)=='}'||s.charAt(i)==']')
            {
                if(st.empty()){
                flag=false;
                break;
                }
                char p=st.pop();
                if((s.charAt(i)==')' && p!='(')||(s.charAt(i)==']' && p!='[')||(s.charAt(i)=='}' && p!='{'))
                {
                    flag=false;
                    break;
                }
            }
        }
     if(!st.empty())
     flag=false;
     return flag;
    }
}