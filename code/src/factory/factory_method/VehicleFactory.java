package factory.factory_method;

/**
 * 简单工厂
 * 缺点：可扩展性较差，每次新增一个产品都需要修改工厂类
 */
public class VehicleFactory {
  public Car createCar() {
    // 添加权限处理、日志、事务等
    return new Car();
  }

  public Plane createPlane() {
    // 添加权限处理、日志、事务等
    return new Plane();
  }
}

