public class Knight extends Piece {
    public Knight() {}

    public Knight(int x, int y){
        super(x, y);
    }
    public boolean isLegalMove(int c, int d){
        if((Math.abs(X - c) == 1 && Math.abs(Y - d) == 2) || (Math.abs(X - c) == 2 && Math.abs(Y - d) == 1))
            return true;
        else
            return false;
    }
}
