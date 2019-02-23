package prep5;

import java.util.ArrayList;

public class Board
{
   private Field[][] fields;
   
   public Board(int rows, int cols)
   {
      fields=new Field[rows][cols];
   }
   public void setPiece(int row, int col, Piece piece)
   {
      fields[row][col].setPiece(piece);
   }
   public void removePiece(int row, int col)
   {
      fields[row][col].removePiece();
   }
   public void movePiece(int fromRow, int fromCol, int toRow, int toCol)
   {
      Piece piece=fields[fromRow][fromCol].getPiece();
      removePiece(fromRow, fromCol);
      setPiece(toRow, toCol, piece);
   }
   public Piece show(int row, int col)
   {
      return fields[row][col].getPiece();
   }
   public boolean isEmpty(int row, int col)
   {
      if(show(row, col)==null)
         return true;
      else
         return false;
   }
   public String toString()
   {
      String print="";
      for(int i=0;i<fields.length;i++)
      {
         for(int j=0;j<fields[i].length;j++)
            print+=fields[i][j].toString()+" ";
         print+="\n";
      }
      return print;
   }
}
