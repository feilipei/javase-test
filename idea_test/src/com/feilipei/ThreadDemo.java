package com.feilipei;

/**
 * @author jcf
 * @date 2020/6/26 - 10:21
 */
public class ThreadDemo {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        MyThread t3 = new MyThread();
        t1.setName("康熙");
        t2.setName("四阿哥");
        t3.setName("八阿哥");
        //设置主线程名字
        Thread.currentThread().setName("主线程");

        t1.setDaemon(true);
        t2.setDaemon(true);
        t3.setDaemon(true);


        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t2.start();
        t3.start();


        for(int i=0;i<10;i++){
            System.out.println(Thread.currentThread().getName()+":"+i);
        }

    }
}
