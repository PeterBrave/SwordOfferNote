package Singleton;

/**
 * @author kavin
 * @date 2019-09-02 09:08
 * 懒汉模式
 */
public class SingleTestLazy {
    private static SingleTestLazy instance;
    private SingleTestLazy() {}

    //多线程保证安全要加锁
    public static synchronized SingleTestLazy getInstance() {
        if (instance == null) {
            instance = new SingleTestLazy();
        }
        return instance;
    }

}


