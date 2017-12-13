package com.dima.Main.animals;

/**
 * Created by User on 12/13/2017.
 */
public class Main {

  public static void main(String[] args) {
    Animal animal = new Animal();
    animal.eat();
    animal.growUp();

    Dog dog = new Dog();

    dog.walk();

    dog.eat();
    dog.growUp();
    dog.voice();

    Cat cat = new Cat("Murzik", "persian");
    cat.voice();
    cat.eat();
    cat.growUp();

    Animal cat1 = new Cat("Max", "norvegian");
    cat1.voice();

    Animal dog1  = new Dog();
    dog1.voice();

    Animal[] animals = new Animal[5];
    animals[0] = cat;
    animals[1] = dog1;
    animals[2] = new Dog();

    for (Animal animal1 : animals) {
      if (animal1 != null) {
        animal1.voice();
      }
    }
  }
}
