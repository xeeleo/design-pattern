package singleton;

/**
 * lazy loading
 * 懒汉式
 * 虽然达到了按需初始化的目的，但却带来了线程不安全的问题
 * 可以通过加锁Synchronized解决，但也带来了效率下降
 */
public class Mgr6 {
  private static volatile Mgr6 instance; // volatile 保证可见性，禁止指令重排序

  private Mgr6() {
  }

  public static Mgr6 getInstance() {
    /**
     * 下面的第一个if为什么不能删？
     * 当instance被创建之后，会减少很多次上锁操作，提高效率
     */
    if (instance == null) {
      /**
       * 双重检查
       */
      synchronized (Mgr6.class) {
        if (instance == null) {
          try {
            Thread.sleep(1);
          } catch (Exception e) {
            e.printStackTrace();
          }
          instance = new Mgr6();
        }
      }
    }
    return instance;
  }

  public static void main(String[] args) {
    for (int i = 0; i < 100; i++) {
      new Thread(() -> {
        System.out.println(Mgr6.getInstance().hashCode());
      }).start();
    }
  }

}
