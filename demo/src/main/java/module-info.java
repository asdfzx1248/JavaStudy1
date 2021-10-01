module top.zsy.demo {
    requires javafx.controls;
    requires javafx.fxml;


    opens top.zsy.demo.jfx.ctrl to javafx.fxml;
    exports top.zsy.demo.jfx;
}