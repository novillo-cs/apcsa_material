public class ChessBoard
{
 public static void main(String[] args)
    {
        String[][] chess = new String[8][8];
        
        chess[0][0] = "Rook";
         
        chess[0][1] = "Knight";
         chess[0][2] = "Bishop";
             chess[0][3] = "Queen";
        
        
        chess[0][4] = "King";
chess[0][5] = "Bishop";

        chess[0][6] = "Knight";
     
        chess[0][7] = "Rook";

                    for (int i = 0; i < 8; i++) {
                chess[1][i] = "Pawn";
 }
            for (int j = 2; j <= 5; j++) {
          for (int i = 0; i < 8; i++) {
                chess[j][i] = "-";}}
          for (int i = 0; i < 8; i++) {
    chess[6][i] = "Pawn";}
        chess[7][0] = "Rook";
        chess[7][1] = "Knight";
                        chess[7][2] = "Bishop";
            chess[7][3] = "Queen";
        chess[7][4] = "King";
  chess[7][5] = "Bishop";
         chess[7][6] = "Knight";
        chess[7][7] = "Rook";
                print(chess);
    }    
    
public static void print(String[][] array)
         { for (int j = 0; j < array.length; j++) 
    
    
    { for (int i = 0; i < array[i].length; i++) {
         System.out.print(array[j][i] );
            }
            System.out.println();}}}
