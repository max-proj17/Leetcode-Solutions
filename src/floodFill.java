public class floodFill {
    public static int[][] floodFilled(int[][] image, int sr, int sc, int color) {

        if(color == image[sr][sc])
        {
            return image;
        }
        int start = image[sr][sc];
        return dfs(image, sr, sc, color, start);


    }
    public static int[][] dfs(int [][]image, int cr, int cc, int color, int start)
    {
        if(cr < 0 || cr >= image.length || cc < 0 || cc >=image[0].length || image[cr][cc]!=start)
        {
            return image;
        }

        image[cr][cc] = color;


        dfs(image, cr+1, cc, color, start);
        dfs(image, cr-1, cc, color, start);
        dfs(image, cr, cc+1, color, start);
        dfs(image, cr, cc-1, color, start);

        return image;

    }
    public static void main(String [] args)
    {
        int[][]grid = new int[][]{{0,0,0},{0,0,0}};
        System.out.println(floodFilled(grid, 0, 0, 0));
    }
}
