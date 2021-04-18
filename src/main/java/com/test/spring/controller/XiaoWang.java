package com.test.spring.controller;

import com.test.spring.service.CarService;
import org.junit.Test;

/**
 * @Description：小王
 */
public class XiaoWang {

    @Test
    public void needGotoHome(){
        CarService carService = new CarService();
        carService.gotoHome();
    }

    @Test
    public void needGotoWork(){
        CarService carService = new CarService();
        carService.gotoWork();
    }

    @Test
    public void needFindMM(){
        CarService carService = new CarService();
        carService.findMM();
    }
}
