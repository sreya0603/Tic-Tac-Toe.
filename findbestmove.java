class findbestmove {
 
 public static void bestMove(char[][] board){
     
     
       
       double bestscore = Double.NEGATIVE_INFINITY;
       int bestrow=-1;
       int bestcol=-1;
       for(int i=0; i<3; i++){
             for(int j=0;j<3;j++){
                if(board[i][j]=='-'){
                board[i][j]='o';
                double  score=minimax(board,0,true);
                board[i][j]='-';
                if(score>bestscore){
                bestscore=score;
                bestrow=i;
                bestcol=j;
                }
                }
                 
             }
     }
     board[bestrow][bestcol]='o';
     
     }
     public static int Score(int r){
     if(r=='o'){
     return 1;
     }
     else if(r=='x'){
     return -1;
     }
     else {
     return 0;
     }
     }
     
  public static double minimax(char[][] board,int depth,boolean ismaximising){
  
  check checkobj= new check();
              
     int result=checkobj.haswon(board);
     if(result!='-')
     {
     int scor=Score(result);
     return scor;
     }
     if(ismaximising){
    
     double bestscore = Double.NEGATIVE_INFINITY;
        
     for(int i=0; i<3; i++){
             for(int j=0;j<3;j++){
                if(board[i][j]=='-'){
                board[i][j]='x';
                double  score=minimax(board,depth+1,false);
                board[i][j]='-';
                if(score>bestscore){
                bestscore=score;
                
                }
                 
             }}}
     return bestscore;
     }
     else{
      
     double bestscore = Double.POSITIVE_INFINITY;
     for(int i=0; i<3; i++){
             for(int j=0;j<3;j++){
                if(board[i][j]=='-'){
                board[i][j]='o';
                double  score=minimax(board,depth+1,true);
                board[i][j]='-';
                if(score<bestscore){
                bestscore=score;
                }
                }}}
     return bestscore;
     }
}
} 
 
