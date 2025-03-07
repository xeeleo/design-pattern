package factory.factory_method;

import factory.Movable;

public class Car implements Movable {
  public void go() {
    System.out.println("Car is moving");
  }
}
