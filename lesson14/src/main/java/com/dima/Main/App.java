package com.dima.Main;

/**
 * Created by User on 12/10/2017.
 */
public class App {

  public static void main(String[] args) {
    Player player1 = new Player("John", 'x');
    Player player2 = new Player("Sam", '0');

    Game game = new Game(player1, player2);
    String result = game.gameResult();
    System.out.println(result);
  }
}


