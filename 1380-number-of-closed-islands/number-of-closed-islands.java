
class pair{
   int i,j;
   public pair(int i,int j){
      this.i=i;this.j=j;
   }
}
class Solution {
    public int closedIsland(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        Queue<pair>q=new LinkedList<>();
        for(int i=0;i<m;i++){
            if(grid[i][0]==0){q.add(new pair(i,0));grid[i][0]=2;}
            if(grid[i][n-1]==0){q.add(new pair(i,n-1));grid[i][n-1]=2;}
        }
        for(int i=0;i<n;i++){
            if(grid[0][i]==0){q.add(new pair(0,i));grid[0][i]=2;}
            if(grid[m-1][i]==0){q.add(new pair(m-1,i));grid[m-1][i]=2;}
        }
        int[] xdir=new int[]{0,-1,0,1};
        int[] ydir=new int[]{-1,0,1,0};
        while(!q.isEmpty()){
            pair curr=q.poll();
            int i=curr.i;
            int j=curr.j;
            for(int k=0;k<4;k++){
                int ni=i+xdir[k];
                int nj=j+ydir[k];
                if(ni<0 || nj<0|| ni>=m || nj>=n)continue;
                if(grid[ni][nj]==0){q.add(new pair(ni,nj));grid[ni][nj]=2;}
            }
        }
        int c=0;
        for(int x=0;x<m;x++){for(int y=0;y<n;y++){if(grid[x][y]==0){q.add(new pair(x,y));c++;}
        while(!q.isEmpty()){
            pair curr=q.poll();
            int i=curr.i;
            int j=curr.j;
            for(int k=0;k<4;k++){
                int ni=i+xdir[k];
                int nj=j+ydir[k];
                if(ni<0 || nj<0|| ni>=m || nj>=n)continue;
                if(grid[ni][nj]==0){q.add(new pair(ni,nj));grid[ni][nj]=2;}
            }
        }
        }}
        return c;
    }
}