package Singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author kavin
 * @date 2019-09-04 15:15
 */
public class Test {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        SingletonTestLazy instance = SingletonTestLazy.getInstance();
        Constructor constructor = SingletonTestLazy.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        SingletonTestLazy instance2 = (SingletonTestLazy) constructor.newInstance();
        System.out.println(instance);
        System.out.println(instance2);
    }
}
