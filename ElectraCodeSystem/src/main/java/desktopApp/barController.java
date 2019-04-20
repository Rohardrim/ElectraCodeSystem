package desktopApp;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class barController {

    @FXML
    Label lab;

    public void change(){
        lab.setText("bolek");
    }

}
