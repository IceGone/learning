package automic;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @program: learning
 * @description: java.util.concurrent.automic
 * @author: bjchen
 * @create: 2020-06-19
 **/
public class AtomicTest {
    public static void main(String[] args) {
        AtomicInteger a =new AtomicInteger();
        String s ="";
        System.out.println(a.get());
        a.set(10);
        int i = a.addAndGet(10);
        System.out.println(a.toString());
        System.out.println(a.get());
        System.out.println(a.get());
        System.out.println(a.get());
        System.out.println(a.get());
        System.out.println(a.get());
        System.out.println(a.get());

    }
}
