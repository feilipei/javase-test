package com.feilipei;

/**
 * @author jcf
 * @date 2020/6/26 - 20:57
 */
public class ClassLoadDemo {
    public static void main(String[] args) {
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        System.out.println(systemClassLoader);
        ClassLoader parent = systemClassLoader.getParent();
        System.out.println(parent);
        ClassLoader loader = parent.getParent();
        System.out.println(loader);
//        12
    }
}
