/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public Node cloneGraph(Node node) {
        if(node==null)return null;
        HashMap<Integer,Node>hm=new HashMap<>();
        Queue<Node>q=new ArrayDeque<>();
        q.offer(node);
        while(!q.isEmpty()){
            Node curr=q.poll();
            if(hm.containsKey(curr.val))continue;
            hm.put(curr.val,curr);
            for(Node nei:curr.neighbors){
                q.offer(nei);
            }
        }
        HashMap<Integer,Node>copyset=new HashMap<>();
        q.offer(node);
        while(!q.isEmpty()){
            Node curr=q.poll();
            if(!hm.containsKey(curr.val)){continue;}
            if(!copyset.containsKey(curr.val)){Node copy=new Node(curr.val);
            copyset.put(curr.val,new Node(curr.val));}
            Node copy=copyset.get(curr.val);
            for(Node nei:hm.get(copy.val).neighbors){
                if(!copyset.containsKey(nei.val))copyset.put(nei.val,new Node(nei.val));
                copy.neighbors.add(copyset.get(nei.val));
                q.offer(nei);
            }
            hm.remove(copy.val);
        }
        return copyset.get(1);
    }
}