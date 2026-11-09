class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        HashMap<String,Integer>hm=new HashMap<>();
        List<String> res = new ArrayList<>();
        for(int i=0;i<s.length()-9;i++){
            hm.put(s.substring(i,i+10),hm.getOrDefault(s.substring(i,i+10),0)+1);
        }
        for(String t:hm.keySet()){
            if(hm.get(t)>1)res.add(t);
        }
        return res;
    }
}