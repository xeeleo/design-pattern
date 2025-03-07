package singleton;

/**
 * lazy loading
 * 懒汉式
 * 虽然达到了按需初始化的目的，但却带来了线程不安全的问题
 * 当第一个线程执行 getInstance 方法时，instance 为 null，会 new 一个实例，此时第二个线程也执行 getInstance方法，此时 instance 如果还未被实例化，会 new 另外一个实例
 */
public class Mgr3 {
  private static Mgr3 instance;

  private Mgr3() {
  }

  public static Mgr3 getInstance() {
    if (instance == null) {
      Mgr3.instance = new Mgr3();
    }
    return instance;
  }

  public static void main(String[] args) {
    for (int i = 0; i < 100; i++) {
      new Thread(() -> {
        System.out.println(Mgr3.getInstance().hashCode());
      }).start();
    }
  }
}
