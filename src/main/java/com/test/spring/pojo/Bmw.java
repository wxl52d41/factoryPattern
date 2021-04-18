package com.test.spring.pojo;

/**
 * @Description：宝马
 */
public class Bmw implements Car {

    public void start(){
        System.out.println("宝马开启");
    }

    public void run(){
        System.out.println("宝马运行");
    }

    public void stop(){
        System.out.println("宝马熄火");
    }
}
