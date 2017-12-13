package com.dima.Main.animals;

/**
 * Created by User on 12/13/2017.
 */
public class Dog extends Animal {

  private String name;
  private String breed;

  public void walk() {
    System.out.println("I'm walking");
  }

  @Override
  public void voice() {
    System.out.println("bark - bark");
  }
}
