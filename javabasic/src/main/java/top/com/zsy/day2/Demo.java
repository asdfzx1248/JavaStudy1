package top.com.zsy.day2;

import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;


@Slf4j
public class Demo {
    private static int staticVar = 1024;
    private String instanceVar = "hello";
    public void method(){
        int localVar = 666;
        log.info("localVar before:{}",localVar);
        localVar= 888;
        log.info("localVar after:{}",localVar);
    }

    public static void main(String[] args) {
        log.info("localVar before:{}",staticVar);
        staticVar= 2048;
        log.info("localVar after:{}",staticVar);


    }
}
