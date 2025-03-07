package factory.factory_abstract;

import factory.factory_abstract.abstract_cls.Food;
import factory.factory_abstract.abstract_cls.Vehicle;
import factory.factory_abstract.abstract_cls.Weapon;

public class Main {
  public static void main(String[] args) {
    AbstractFactory f = new ModernFactory();
    Food food = f.createFood();
    food.printName();
    Vehicle vehicle = f.createVehicle();
    vehicle.go();
    Weapon weapon = f.createWeapon();
    weapon.shoot();
  }
}
