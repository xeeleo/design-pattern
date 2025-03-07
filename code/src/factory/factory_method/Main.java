package factory.factory_method;

import factory.Movable;

public class Main {
  public static void main(String[] args) {
    Movable c = new Car();
    Movable p = new Plane();
    c.go();
    p.go();
  }
}
