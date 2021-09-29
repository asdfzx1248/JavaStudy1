package top.com.zsy.day5;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Demo11 {
    public static void main(String[] args) {
        int a, b;
        a = 10;
        b = (a == 1) ? 20 : 30;
        log.info("Value of b is :" + b);

        b = (a == 10) ? 20 : 30;
        log.info("Value of b is :" + b);
    }
}
