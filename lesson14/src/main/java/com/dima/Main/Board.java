package com.dima.Main;

/**
 * Created by User on 12/13/2017.
 */
public class Board {

  private char[][] field = new char[3][3];

  public  Board() {
    fillboard();
  }

  private void fillboard() {

  }

  public void fillCell(int x, int y, char value) {
    field[x][y] = value;
  }

  public void print() {

  }

  public boolean isFilled() {
    return false;
  }

  public boolean isWinningCombination() {
    return  false;
  }
}
