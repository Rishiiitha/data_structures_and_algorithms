class Solution {
  static void check(int []candidates,List<List<Integer>> res,int st,int remain,List<Integer>curr){
      
      if(remain<0)return ;
      if(remain==0){res.add(new ArrayList<>(curr));return;}
      for(int k=st;k<candidates.length;k++){
         curr.add(candidates[k]);
         check(candidates,res,k,remain-candidates[k],curr);
         curr.remove(curr.size()-1);
      }
      
   }    

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
      List<List<Integer>>res=new ArrayList<>();
      check(candidates,res,0,target,new ArrayList<>());
      return res;
    }
}