public class Rook extends Piece {
    public Rook() {}

    public Rook(int x, int y){
        super(x, y);
    }
    public boolean isLegalMove(int c, int d){
        if(X == c || Y == d)
            return true;
        else
            return false;
    }
}
