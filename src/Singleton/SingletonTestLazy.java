package Singleton;

import java.lang.reflect.ReflectPermission;

/**
 * @author kavin
 * @date 2019-09-02 09:08
 * 懒汉模式
 */
public class SingletonTestLazy {
    private static SingletonTestLazy instance;
    private SingletonTestLazy() {
        SecurityManager manager = new SecurityManager();
        manager.checkPermission(new ReflectPermission("Forbidden Reflect!"));
    }

    //多线程保证安全要加锁
    public static synchronized SingletonTestLazy getInstance() {
        if (instance == null) {
            instance = new SingletonTestLazy();
        }
        return instance;
    }
}


