class Solution {
    public int minAddToMakeValid(String s) {
        int oc=0,count=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='(')oc++;
            if(c==')'){
                if(oc>0)oc--;
                else count++;
            }
        }
        return oc+count;
    }
}