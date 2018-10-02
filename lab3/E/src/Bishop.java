public class Bishop extends Piece {
    public Bishop() {}

    public Bishop(int x, int y){
        super(x, y);
    }
    public boolean isLegalMove(int c, int d){
        if(Math.abs(c - X) == Math.abs(Y - d))
            return true;
        else
            return false;
    }
}
