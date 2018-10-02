public abstract class Piece {
    public int X;
    public int Y;
    public Piece () {}

    public Piece (int x, int y){
        this.X = x;
        this.Y = y;
    }
    public abstract boolean isLegalMove(int c, int d);
}
