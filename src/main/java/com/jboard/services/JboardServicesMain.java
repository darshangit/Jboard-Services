package com.jboard.services;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by Dash on 9/9/2017.
 */
@ComponentScan
@EnableAutoConfiguration
public class JboardServicesMain {

    public static void main(String ...args){
        SpringApplication.run(JboardServicesMain.class,args);
    }
}
