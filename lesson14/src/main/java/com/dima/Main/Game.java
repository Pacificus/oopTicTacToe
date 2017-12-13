package com.dima.Main;

/**
 * Created by User on 12/13/2017.
 */
public class Game {

  public static final char X = 'x';
  private Board board;
  private Player player1;
  private Player player2;

  private Player currentPlayer;

  public Game(Player player1, Player player2) {
    board = new Board();

    this.player1 = player1;
    this.player2 = player2;

    setCurrentPlayer();
  }

  private void setCurrentPlayer() {
    if (player1.getSymbol() == X) {
      this.currentPlayer = player1;
    } else {
      this.currentPlayer = player2;
    }
  }

  public void play() {
    while (!igameFinished()) {
      makeMove();
      changedPlayer();
      board.print();
    }
  }

  public String gameResult() {
    changedPlayer();
    if (board.isWinningCombination()) {
      return "Победитель" + currentPlayer.getName();
    }
    else if (board.isFilled()) {
      return "Ничья";
    }
    else {
      return "...В процессе";
    }
  }

  private void changedPlayer() {
    currentPlayer = currentPlayer == player1 ? player2 : player1;
  }

  private void makeMove() {
    //Scanner scanner =
  }

  private boolean igameFinished() {
    return  board.isFilled()
        || board.isWinningCombination();
  }
}
