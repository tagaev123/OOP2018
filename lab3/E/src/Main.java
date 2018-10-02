public class Main {
    public static void main(String[] args){
        Piece king = new King(4, 4);
        Piece pawn = new Pawn (1, 1);
        Piece rook = new Rook(1, 1);
        Piece knight = new Knight(1, 1);
        Piece bishop = new Bishop(1, 1);
        Piece queen = new Queen(1, 1);
        if(king.isLegalMove(5, 5))
            System.out.println("Yes, for king it's legal");
        else
            System.out.println("No, it isn't");

        if(pawn.isLegalMove(1, 2))
            System.out.println("Yes, for pawn it's legal");
        else
            System.out.println("No, it isn't");

        if(rook.isLegalMove(2, 1))
            System.out.println("Yes, for rook it's legal");
        else
            System.out.println("No, it isn't");

        if(knight.isLegalMove(8, 2))
            System.out.println("Yes, for knight it's legal");
        else
            System.out.println("No, it isn't");

        if(bishop.isLegalMove(5, 5))
            System.out.println("Yes, for bishop it's legal");
        else
            System.out.println("No, it isn't");

        if(queen.isLegalMove(5, 4))
            System.out.println("Yes, for queen it's legal");
        else
            System.out.println("No, it isn't");




    }
}
