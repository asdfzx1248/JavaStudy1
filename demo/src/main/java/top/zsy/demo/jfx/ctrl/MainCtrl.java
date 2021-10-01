package top.zsy.demo.jfx.ctrl;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * 主界面控制器
 *
 */
public class MainCtrl implements Initializable {

    public Pane rootPane;

    public Button btnAlert;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        System.out.println("initialize: " + location.getPath());
    }

    /**
     * 弹出框按钮单击事件
     *
     * @param actionEvent 事件对象
     */
    public void onBtnAlertClick(ActionEvent actionEvent) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setContentText("你好");
        alert.show();
    }
}
