package factory.factory_abstract;

import factory.factory_abstract.abstract_cls.Food;
import factory.factory_abstract.abstract_cls.Vehicle;
import factory.factory_abstract.abstract_cls.Weapon;

public abstract class AbstractFactory {

  abstract Food createFood();

  abstract Vehicle createVehicle();

  abstract Weapon createWeapon();
}

/**
 * 扩展产品使用工厂方法
 * 扩展产品族使用抽象工厂
 */