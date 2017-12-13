package com.dima.Main;

/**
 * Created by User on 12/13/2017.
 */
public class Player {

  private String name;
  private char symbol;

  public String getName() {
    return name;
  }

  public char getSymbol() {
    return symbol;
  }

  public Player(String name, char symbol) {
    this.name = name;
    this.symbol = symbol;
  }
}
