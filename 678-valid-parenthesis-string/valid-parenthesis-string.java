class Solution {
    public boolean checkValidString(String s) {
        boolean []free=new boolean[s.length()];
        Stack<Integer>st=new Stack<>();
        Stack<Integer>fr=new Stack<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='(')st.push(i);
            else if(c=='*'){
                fr.push(i);
            }
            else if(c==')'){
                if(!st.isEmpty())st.pop();
                else if(!fr.isEmpty())fr.pop();
                else return false;
            } 
        }
        while(!st.isEmpty() && !fr.isEmpty()){
            if(st.peek()>fr.peek())break;
            if(st.peek()<fr.peek()){fr.pop();st.pop();}
            
        }
        return st.isEmpty();
    }
}