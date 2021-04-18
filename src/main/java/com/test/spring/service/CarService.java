package com.test.spring.service;

import com.test.spring.pojo.Bmw;
import com.test.spring.pojo.Car;

/**
 * @Description：车辆服务
 */
public class CarService {

    Car car = new Bmw();

    public void gotoHome(){
        car.start();
        car.run();
        car.stop();
        System.out.println("到家");
    }

    public void gotoWork(){
        car.start();
        car.run();
        car.stop();
        System.out.println("到公司");
    }

    public void findMM(){
        car.start();
        car.run();
        car.stop();
        System.out.println("到约会地点");
    }


}
