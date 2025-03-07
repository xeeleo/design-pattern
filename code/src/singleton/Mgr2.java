package singleton;

/**
 * 使用静态语句块实现单例模式，和Mgr1类似
 */
public class Mgr2 {
  private static Mgr2 instance;

  static {
    Mgr2.instance = new Mgr2();
  }

  private Mgr2() {
  }

  public static Mgr2 getInstance() {
    return Mgr2.instance;
  }

  public static void main(String[] args) {
    Mgr2 mgr1 = Mgr2.getInstance();
    Mgr2 mgr2 = Mgr2.getInstance();
    System.out.println(mgr1 == mgr2);
  }
}
