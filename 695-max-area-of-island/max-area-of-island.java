class Solution {
    public static int backtrack(int[][]grid,int row,int col){
        if(row<0 || row>= grid.length || col< 0 || col >= grid[0].length || grid[row][col] ==0){
            return 0;
        }
        grid[row][col]=0;

        int area=1;
        area += backtrack(grid,row+1,col);
        area += backtrack(grid,row,col+1);
        area += backtrack(grid,row-1,col);
        area += backtrack(grid,row,col-1);
        return area;
    }
    public int maxAreaOfIsland(int[][] grid) {
        if( grid == null || grid.length == 0){
            return 0;
        }
        int max = 0;
        int row=grid.length;
        int col=grid[0].length;
        
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(grid[i][j]==1){
                    int ans = backtrack(grid,i,j);
                    max = Math.max(max,ans);
                }
            }
        }
        return max;
    }
}