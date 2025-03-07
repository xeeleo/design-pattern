package singleton;

/**
 * lazy loading
 * 懒汉式
 * 加锁，线程安全
 * 虽然达到了按需初始化的目的，但却带来了线程不安全的问题
 * 可以通过加锁Synchronized解决，但也带来了效率下降
 */
public class Mgr4 {
  private static Mgr4 instance;

  private Mgr4() {
  }

  public static synchronized Mgr4 getInstance() {
    if (instance == null) {
      try {
        Thread.sleep(1);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      instance = new Mgr4();
    }
    return instance;
  }

  public static void main(String[] args) {
    Runnable runnable = new Runnable() {
      @Override
      public void run() {
        System.out.println(Mgr4.getInstance().hashCode());
      }
    };
    for (int i = 0; i < 100; i++) {
      new Thread(runnable).start();
    }
  }
}
