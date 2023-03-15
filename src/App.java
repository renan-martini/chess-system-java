import models.chess.ChessMatch;

public class App {
    public static void main(String[] args) throws Exception {
        ChessMatch chessMatch = new ChessMatch();
        System.out.print("\033\143");
        UI.printBoard(chessMatch.getPieces());
    }
}
