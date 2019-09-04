package Singleton;

/**
 * @author kavin
 * @date 2019-09-04 09:49
 * 饿汉模式，也叫做静态内部类
 * 无论调用多少次InstanceHolder.instance，他只会new一次instance。坏处是不管掉不掉用，都会new出来
 */
public class SingletonTestHungry {
    private SingletonTestHungry() {}
    public static SingletonTestHungry getInstance() {
        return InstanceHolder.instance;
    }
    private static class InstanceHolder {
        private static SingletonTestHungry instance = new SingletonTestHungry();
    }
}
