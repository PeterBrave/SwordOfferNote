package Singleton;

/**
 * @author kavin
 * @date 2019-09-04 09:10
两次判空，第一个判空是决定是否加锁，第二个判空new出来的是否为空
new一个新的instance的过程如下
1. instance:分配到栈内存
2. new:分配到堆内存
3. instance指向了一块内存地址
 如果是按照顺序执行，不会出现问题，万一不按照顺序执行，例如1-->3就会出现new出来的为null，就需要这样判断，不过发生的概率很小
*/
public class SingleTestDLC {
    private static SingleTestDLC instance;
    private SingleTestDLC() {}

    public static SingleTestDLC getInstance() {
        if (instance == null) {
            synchronized (SingleTestDLC.class) {
                if (instance == null) {
                    instance = new SingleTestDLC();
                }
            }
        }
        return instance;
    }
}
