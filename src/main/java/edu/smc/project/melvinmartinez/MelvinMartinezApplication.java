package edu.smc.project.melvinmartinez;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MelvinMartinezApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MelvinMartinezApplication.class.getResource("melvinmartinez.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("MelvinMartinez!");
        stage.setScene(scene);
        stage.show();
    }
}
