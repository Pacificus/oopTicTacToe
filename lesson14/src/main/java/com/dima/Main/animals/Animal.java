package com.dima.Main.animals;

/**
 * Created by User on 12/13/2017.
 */
public class Animal {

  private int height;
  private int weight;

  public Animal() {

  }

  public Animal(int height, int weight) {
    this.height = height;
    this.weight = weight;
  }

  public void growUp() {
    height++;
    System.out.println("I'm growing up");
  }

  public void eat() {
    weight++;
    System.out.println("Eating");
  }

  public void voice() {
    System.out.println("Nothing");
  }
}
