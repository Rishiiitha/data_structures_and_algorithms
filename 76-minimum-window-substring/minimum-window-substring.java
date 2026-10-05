class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character,Integer>hm=new HashMap<>();
        HashMap<Character,Integer>map=new HashMap<>();
        int left=0,right=0,found=0;
        int n=s.length();
        int m = t.length();
        int minlen=n,mini=0,minj=n;

        for(int i=0;i<t.length();i++){
            map.put(t.charAt(i),map.getOrDefault(t.charAt(i),0)+1);
        }

        while(left<=right){
            for(char c: map.keySet()){
               while(hm.getOrDefault(c,0)<map.get(c) && right<n){
                char cr=s.charAt(right);
                if(map.containsKey(cr))hm.put(cr,hm.getOrDefault(cr,0)+1);
                right++;
               }
            }
            if(hm.size()==map.size()){
                int flag=1;
                for(char c:map.keySet()){
                    if(hm.get(c)<map.get(c)){
                        flag=0;
                        break;
                    }
                }
                if(flag==1){
                    found=1;
                    if(right-left<minlen){
                        minlen=right-left;
                        mini=left;minj=right;
                    }
                }
            }
            if(left>=n)break;
            char cl=s.charAt(left);
            if(hm.containsKey(cl)){
                hm.put(cl,hm.get(cl)-1);
            }
            left++;
        }
        if(found==0)return "";
        return s.substring(mini,minj);
    }
}