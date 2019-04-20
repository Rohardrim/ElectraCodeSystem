package desktopApp.controlers;


import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class LoginBarController {

//    private Scene loginBarScene;
//
//    public void setLoginBarScene(Scene loginBarScene) {
//        this.loginBarScene = loginBarScene;
//    }

    @FXML
    JFXPasswordField passwordField;

    @FXML
    JFXTextField loginField;

    @FXML
    AnchorPane loginMainPane;

    public void openBoardScene(ActionEvent actionEvent) throws Exception{

        //if (loginField.getText().equals("ghj") && passwordField.getText().equals("ghj")) {

//            Main m = new Main();
//            Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
//            stage.setScene(m.setMainBoard(stage));
        Platform.runLater(new Runnable() {
            public void run() {
                Parent root = null;

                try {
                    root = FXMLLoader.load(getClass().getResource("/splash.fxml"));
                    final Scene scene = new Scene(root);
                    final Stage stage = new Stage();
                    stage.initStyle(StageStyle.UNDECORATED);

                    stage.setResizable(true);

                    stage.setScene(scene);
                    stage.show();
                    loginMainPane.getScene().getWindow().hide();

                }catch (Exception e){
                    System.out.println(e.getMessage());
                }
            }
        });
        //}
    }


    public void closeWindow(ActionEvent actionEvent) {
        System.exit(0);
    }

}
