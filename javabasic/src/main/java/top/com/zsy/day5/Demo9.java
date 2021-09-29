package top.com.zsy.day5;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Demo9 {
    public static void main(String[] args) {
        Animal animal = new Cat();
        boolean result = animal instanceof Cat;
        log.info(String.valueOf(result));
    }

    static class Animal {

    }

    static class Cat extends Animal{

    }
}
