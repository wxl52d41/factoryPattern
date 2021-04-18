package com.test.spring.pojo;

/**
 * @Description：奥迪车
 */
public class Audi implements Car {

    public void start(){
        System.out.println("奥迪开启");
    }

    public void run(){
        System.out.println("奥迪运行");
    }

    public void stop(){
        System.out.println("奥迪熄火");
    }
}
