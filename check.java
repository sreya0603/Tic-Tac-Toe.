class check {

   public static boolean ifgameEnd(char[][] board,boolean gameEnd){
          
          if(haswon(board)=='x'){
          System.out.println("player 1 has won");
          return true;
          }
          if(haswon(board)=='o'){
          System.out.println("computer has won");
          return true;
          }
          if(hastied(board)){
             System.out.println("draw");
             return true;}
          return false;
          }
          
     public static char haswon(char[][] board){
     for(int i=0; i<3; i++){
     if(board[i][0]==board[i][1]&&board[i][1]==board[i][2]&&board[i][0]!='-'){
             return board[i][0];
             }}
     for(int j=0; j<3; j++){
     if(board[0][j]==board[1][j]&&board[1][j]==board[2][j]&&board[0][j]!='-'){
             return board[0][j];
             }}
     if(board[0][0]==board[1][1]&&board[1][1]==board[2][2]&&board[0][0]!='-'){
             return board[0][0];
             }
     if(board[2][0]==board[1][1]&&board[1][1]==board[0][2]&&board[2][0]!='-'){
             return board[2][0];
             }
     return '-';    
     }
     public static boolean hastied(char[][] board){
       for(int i=0; i<3; i++){
             for(int j=0;j<3;j++){
                if(board[i][j]=='-'){
                return false;
                }
                 
             }
     }
     return true;
     }


}
