import java.util.Scanner;

class TicTacToe {
     
    public static void main(String[] args) {
           
           char[][] board= new char[3][3];
           
           boolean ifplayer1=true;
          
           boolean gameEnd=false;
          
           char symbol=' ';
           
           Scanner in= new Scanner(System.in);
          
          for(int i=0; i<3; i++){
             for(int j=0;j<3;j++){
              board[i][j]='-';
             }
          }
          
          check checkobj= new check();
          findbestmove find= new findbestmove();
          
          
          System.out.print("enter 'p' for two player: 0r enter 'c' for playing against computer: ");
          char type = in.next().charAt(0);  
          
          if(type=='p'){
          
         while(!gameEnd)
         { 
         drawBoard(board);
         
          if(ifplayer1){
           symbol='x';
          }
          else{
           symbol='o';
          }
          
          if(ifplayer1){
          System.out.println("its player 1's turn(x)");
          }
          else{
          System.out.println("its player 2's turn(o)");
          }
          
          int row=0;
          int col=0;
          
          while(true){
          
          System.out.print("enter the row in (0,1, or2):");
          row=in.nextInt();
          System.out.print("enter the coloumn in (0,1, or2):");
          col=in.nextInt();
          
          if(row<0||row>2||col<0||col>2){
          System.out.println("entered row and coloumn are invalid");
          }
          else if(board[row][col]!='-'){
          System.out.println("entered row and coloumn are already occupied");
          }
          else{
          break;}
          }
          
          board[row][col]=symbol;
          gameEnd=checkobj.ifgameEnd(board,gameEnd);
          ifplayer1= !ifplayer1;
          
        
          }}
          
          else if(type=='c'){
           
         while(!gameEnd)
         { 
         drawBoard(board);
         
          if(ifplayer1){
           symbol='x';
          }
          else{
           symbol='o';
          }
          
          if(ifplayer1){
          System.out.println("its player turn(x)");
          }
          else{
          System.out.println("its computer's turn(o)");
          }
          if(ifplayer1)
          {
          
          int row=0;
          int col=0;
          
          while(true){
          System.out.print("enter the row in (0,1, or2):");
          row=in.nextInt();
          System.out.print("enter the coloumn in (0,1, or2):");
          col=in.nextInt();
          
          if(row<0||row>2||col<0||col>2){
          System.out.println("entered row and coloumn are invalid");
          }
          else if(board[row][col]!='-'){
          System.out.println("entered row and coloumn are already occupied");
          }
          else{
          break;}
          }
          
          board[row][col]=symbol;
          gameEnd=checkobj.ifgameEnd(board,gameEnd);
          ifplayer1= !ifplayer1;
          
          }
          else{
          find.bestMove(board);
          
          gameEnd=checkobj.ifgameEnd(board,gameEnd);
          ifplayer1= !ifplayer1;
          }
          }
   }}
   
   public static void drawBoard(char[][] board){
     
          for(int i=0; i<3; i++){
             
             for(int j=0;j<3;j++){
             System.out.print(board[i][j]+"|");
             }
             System.out.println();
             }
     } 
    
    
} 
