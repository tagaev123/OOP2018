public class King extends Piece {
    public King() {}

    public King(int x, int y){
        super(x, y);
    }
    public boolean isLegalMove(int c, int d){
        if((Math.abs(X - c) == 0 || Math.abs(X - c) == 1) && (Math.abs(Y - d) == 0 || Math.abs(Y - d) == 1))
            return true;
        else
            return false;
    }
}
