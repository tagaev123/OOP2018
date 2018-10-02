public class Queen extends Piece {
    public Queen() {}

    public Queen(int x, int y){
        super(x, y);
    }
    public boolean isLegalMove(int c, int d){
        if((X + Y == c + d || X - Y == c - d) || (X == c || Y == d))
            return true;
        else
            return false;
    }
}