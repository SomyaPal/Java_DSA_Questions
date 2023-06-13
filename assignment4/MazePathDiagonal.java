public class mazePath {
    static void mazePathProblem(int row , int col, int endRow, int endCol, String result){
        if(row==endRow && col==endCol){
            System.out.println(result);
            return;
        }
        if(row>endRow||col>endCol){
            return;
        }
        //move towards right
        mazePathProblem(row, col+1, endRow, endCol, result+"R");
        //move towards diagonal
        mazePathProblem(row+1, col+1, endRow, endCol, result+"I");
        //move towards down
        mazePathProblem(row+1, col, endRow, endCol, result+"D");
    }
    public static void main(String[] args) {
        mazePathProblem(0, 0, 2, 2, "");
    }
}

