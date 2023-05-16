package example.javafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainFx extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/view/app.fxml"));
        Parent root = fxmlLoader.load();

        stage.setTitle("JavaFX Example");
        stage.setScene(new Scene(root, 640.0, 480.0));
        stage.setResizable(true);
        stage.show();
    }

    public static void main(String[] args) {
        MainFx.launch(args);
    }
}
