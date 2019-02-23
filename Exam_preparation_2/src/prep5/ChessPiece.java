package prep5;

public class ChessPiece extends Piece
{
   private boolean isWhite;
   public ChessPiece(String name, boolean isWhite)
   {
      super(name);
      this.isWhite = isWhite;
   }
   public String getInfo()
   {
      if(isWhite)
         return super.getName()+" white.";
      else
         return super.getName()+" black.";
   }

}
