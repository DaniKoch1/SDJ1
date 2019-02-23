package prep5;

public class TicTacToePiece extends Piece
{
   private boolean isX;
   
   public TicTacToePiece(String name, boolean isX)
   {
      super(name);
      this.isX = isX;
   }
   public String getInfo()
   {
      if(isX)
         return super.getName()+" X";
      else
         return super.getName()+" Y";
   }

}
