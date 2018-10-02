public class Pawn extends Piece {
    public Pawn() {}

    public Pawn(int x, int y){
        super(x, y);
    }
    public boolean isLegalMove(int c, int d){
        if(X == c && ((d - Y == 1) || (d - Y == 2)))
            return true;
        else
            return false;
    }
}

