package top.com.zsy.day5;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Demo12 {
    public static void main(String[] args) {
        int a = 60;
        int b = 13;
        int c = 0;

        c = a & b;
        log.info("a & b =" + c);

        c = a | b;
        log.info("a | b =" + c);

        c = a ^ b;
        log.info("a ^ b =" + c);

        c = ~a;
        log.info("~a = " + c);

        c = a << 2;
        log.info("a << 2 =" + c);

        c = a >> 2;
        log.info("a >> 2 =" + c);

        c = a >>> 2;
        log.info("a >>> 2 =" + c);
    }
}
