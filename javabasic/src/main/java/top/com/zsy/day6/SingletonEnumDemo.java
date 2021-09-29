package top.com.zsy.day6;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SingletonEnumDemo {
    private enum SingletonEnum{
        INSTANCE;
        private String name;
        public String getName(){
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
    public static void main(String[] args) {
        SingletonEnum.INSTANCE.setName("soft");
        log.info(SingletonEnum.INSTANCE.getName());
    }
}
