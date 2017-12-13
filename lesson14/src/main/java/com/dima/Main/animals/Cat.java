package com.dima.Main.animals;

/**
 * Created by User on 12/13/2017.
 */
public class Cat extends Animal {

  private  String name;
  private  String breed;

  public Cat(String name, String breed) {
    super(34,23);
    this.name = name;
    this.breed = breed;
  }

  @Override
  public void voice() {
    System.out.println("meau - meau");
  }
}
