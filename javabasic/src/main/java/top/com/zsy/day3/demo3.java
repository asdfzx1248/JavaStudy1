package top.com.zsy.day3;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class demo3 {
    public static void main(String[] args) {
        Integer a = 127;
        Integer b = 127;
        log.info("a == b ? {}" ,a == b);

        Integer c = 128;
        Integer d = 128;
        log.info("c == d ? {}" ,c == d);

        Integer e = 127;
        Integer f = new Integer(127);
        log.info("e == f ? {}" ,e == f);

        Integer g = new Integer(127);
        Integer h = new Integer(127);
        log.info("g == h ? {}" ,g == h);

        Integer i = 128;
        int j = 128;
        log.info("i == j ? {}", i == j);
    }
}
