public class nqueens {
    //to print the board
    public static void printsol(char board[][]){
        for(int i=0;i<board.length;i++){
            for(int j=0; j<board.length;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    //to check if it is safe to place q
    public static boolean issafe(char board[][],int row,int col){
        //check vertical
        for(int i=0;i<board.length;i++){
           if(board[i][col]=='Q'){
               return false;
           }
        }
        //check diagnol left
        for(int i=row-1,j=col+1;i>=0 && j<board.length;i--,j++){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        //check diagonal right
        for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }
    //to place the queen and 'x'
    public static void placeq(char board[][],int row){
      //base case
      if(row==board.length){
        printsol(board);
        return;
      }
      //placing q
      for(int i=0;i<board.length;i++){
        if(issafe(board,row,i)){
            board[row][i]='Q';
            placeq(board, row+1);
            //backtracking
            board[row][i]='X';
        }       
   }   

 }
    public static void main(String args[]){
        int n=4;
        char board[][]=new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='X';
            }
        }
        placeq(board,0);
        

    }
}
