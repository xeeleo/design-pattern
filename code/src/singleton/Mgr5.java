package singleton;

/**
 * lazy loading
 * 懒汉式
 * 虽然达到了按需初始化的目的，但却带来了线程不安全的问题
 * 可以通过加锁Synchronized解决，但也带来了效率下降
 */
public class Mgr5 {
  private static Mgr5 instance;

  private Mgr5() {
  }

  public static Mgr5 getInstance() {
    if (instance == null) {
      /**
       * 妄图通过减小同步代码块的方式提高效率，然而不可行
       * 下面的方法相当于没有加锁，多线程情况下会出现多个实例，因为一个线程释放锁后，另一个线程又会进入创建实例
       */
      synchronized (Mgr5.class) {
        try {
          Thread.sleep(1);
        } catch (Exception e) {
          e.printStackTrace();
        }
        instance = new Mgr5();
      }
    }
    return instance;
  }

  public static void main(String[] args) {
    for (int i = 0; i < 100; i++) {
      new Thread(() -> {
        System.out.println(Mgr5.getInstance().hashCode());
      }).start();
    }
  }

}
