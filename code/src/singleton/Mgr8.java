package singleton;

/**
 * 不仅可以解决线程同步，还可以防止反序列化
 * 原因是枚举类没有构造方法，所以即使拿到他的class文件，也没有办法创建他的实例
 * 枚举单例
 */
public enum Mgr8 {
  instance;

  // 业务方法

  public static void main(String[] args) {
    for (int i = 0; i < 100; i++) {
      new Thread(() -> {
        System.out.println(Mgr8.instance.hashCode());
      }).start();
    }
  }
}
