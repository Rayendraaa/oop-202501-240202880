package com.upb.agripos;

import javafx.application.Application;
import javafx.stage.Stage;

public class AppJavaFX extends Application {

    @Override
    public void start(Stage stage) {
        stage.setTitle("AgriPOS");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
