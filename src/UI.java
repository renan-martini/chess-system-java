import models.chess.ChessPiece;

public class UI {
  public static void printBoard(ChessPiece[][] pieces) {
    for (int i = 0; i < pieces.length; i++) {
      System.out.print(8 - i);
      for (int j = 0; j < pieces[i].length; j++) {
        printPiece(pieces[i][j]);
      }
      System.out.println();
    }
    System.out.print("  a b c d e f g h");
    System.out.println();
  }

  private static void printPiece(ChessPiece piece) {
    System.out.print(" ");
    if (piece == null) {
      System.out.print("-");
    } else {
      System.out.print(piece);
    }
  }
}
