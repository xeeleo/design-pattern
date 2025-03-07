package strategy;

@FunctionalInterface
public interface IComparable<T> {
  int compareTo(T obj1, T obj2);

  default void m() {
    System.out.println("m");
  }
}

/**
 * @FunctionalInterface 注解要求接口只能有一个抽象方法
 * 但可以有多个 default 方法或静态方法
 * default 方法提供了接口的默认实现，子类可以选择重写这些方法
 */
