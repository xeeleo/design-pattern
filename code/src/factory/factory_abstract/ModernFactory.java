package factory.factory_abstract;

import factory.factory_abstract.abstract_cls.Food;
import factory.factory_abstract.abstract_cls.Vehicle;
import factory.factory_abstract.abstract_cls.Weapon;

public class ModernFactory extends AbstractFactory {

  @Override
  Food createFood() {
    return new Bread();
  }

  @Override
  Vehicle createVehicle() {
    return new Car();
  }

  @Override
  Weapon createWeapon() {
    return new AK47();
  }

}
