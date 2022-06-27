public class numIsland {
    public static int numIslands(char[][] grid) {

        if(grid == null || grid.length==0)
        {
            return 0;
        }
        int islands = 0;

        for(int i = 0; i<grid.length; i++){
            for(int j = 0; j<grid[0].length; j++)
            {
                if(grid[i][j] == '1')
                {
                    islands = islands + dfs(grid,i, j);
                }
            }
        }
        return islands;


    }
    public static int dfs(char [][] world, int r, int c)
    {
        if(r<0 || r>=world.length || c<0 || c>=world[0].length || world[r][c] == '0')
        {
            return 0;
        }
        //mark as seen
        world[r][c] = '0';

        dfs(world, r+1, c);
        dfs(world, r-1, c);
        dfs(world, r, c+1);
        dfs(world, r, c-1);

        return 1;

    }
    public static void main(String [] args)
    {
        char[][]grid = new char[][]{{'1','1','1','1','0'},{'1','1','0','1','0'},{'1','1','0','0','0'},{'0','0','0','0','0'}};
        System.out.println("Result: " + numIslands(grid));
    }
}
