package singleton;

/**
 * 饿汉式
 * 类加载到内存后，就实例化一个单例，JVM保证线程安全
 * 简单实用，推荐使用
 * 缺点：不管用到与否，类加载时就完成实例化
 * 静态变量，load到内存就会被初始化
 */
public class Mgr1 {
    private static final Mgr1 instance = new Mgr1();
    private String mgrName = "";

    private Mgr1() {
    }

    public static Mgr1 getInstance() {
        return Mgr1.instance;
    }

    public void m() {
        System.out.println("m, mgrName: " + this.mgrName);
    }

    public static void main(String[] args) {
        Mgr1 mgr1 = Mgr1.getInstance();
        Mgr1 mgr2 = Mgr1.getInstance();
        System.out.println(mgr1 == mgr2);
    }
}
