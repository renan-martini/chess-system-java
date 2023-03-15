package models.chess;

import models.boardgame.Board;

public class ChessMatch {
  private int turn;
  private Color currentPlayer;
  private boolean check;
  private boolean checkMate;
  private ChessPiece enPassantVulnerable;
  private ChessPiece promoted;
  private Board board;

  public ChessMatch() {
    this.board = new Board(8, 8);
  }

  public ChessMatch(int turn, Color currentPlayer, boolean check, boolean checkMate, ChessPiece enPassantVulnerable,
      ChessPiece promoted) {
    this.turn = turn;
    this.currentPlayer = currentPlayer;
    this.check = check;
    this.checkMate = checkMate;
    this.enPassantVulnerable = enPassantVulnerable;
    this.promoted = promoted;
    this.board = new Board(8, 8);
  }

  public ChessPiece[][] getPieces() {
    ChessPiece[][] arr = new ChessPiece[board.getRows()][board.getColumns()];
    for (int i = 0; i < board.getRows(); i++) {
      for (int j = 0; j < board.getColumns(); j++) {
        arr[i][j] = (ChessPiece) board.piece(i, j);
      }
    }
    return arr;
  }
}
