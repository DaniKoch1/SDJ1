package prep5;

public class Field
{
   private Piece piece;
   public Field()
   {
      piece=null;
   }
   public Field(Piece piece)
   {
      this.piece=piece;
   }
   public void setPiece(Piece piece)
   {
      this.piece=piece;
   }
   public void removePiece()
   {
      piece=null;
   }
   public Piece getPiece()
   {
      return piece;
   }
   public String toString()
   {
      if(piece==null)
         return "empty";
      else
         return piece.getInfo();
   }
}
