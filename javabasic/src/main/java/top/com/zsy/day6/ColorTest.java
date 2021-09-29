package top.com.zsy.day6;

import lombok.extern.slf4j.Slf4j;

@Slf4j

public class ColorTest {
    public static void main(String[] args) {
        Color color = Color.RED;
        log.info(String.valueOf(color));
        Color[] arr = Color.values();
        for (Color c : arr){
            log.info("枚举的索引{},枚举的值{}",c.ordinal(),c);
        }


    }
    enum Color{
        /**
         * 红色
         */
        RED,
        /**
         * 黄色
         */
        YELLOW,
        /**
         * 绿色
         */
        GREEN
    }
}
