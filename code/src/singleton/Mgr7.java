package singleton;

/**
 * 完美的写法之一
 * 静态内部类方式
 * JVM保证单例,线程安全
 * 加载外部类时不会加载内部类，这样可以实现懒加载
 */
public class Mgr7 {
  private Mgr7() {
  }

  private static class Mgr7Holder {
    private final static Mgr7 INSTANCE = new Mgr7();
  }

  public static Mgr7 getInstance() {
    return Mgr7Holder.INSTANCE;
  }

  public static void main(String[] args) {
    for (int i = 0; i < 100; i++) {
      new Thread(() -> {
        System.out.println(Mgr7.getInstance().hashCode());
      }).start();
    }
  }

}
