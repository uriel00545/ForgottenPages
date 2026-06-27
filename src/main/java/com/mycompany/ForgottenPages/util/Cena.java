package com.mycompany.ForgottenPages.util;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class Cena {

    private static AnchorPane rootContainer;

    public static void setRootContainer(AnchorPane container) {
        rootContainer = container;
    }

    public static void mostrar(String fxmlPath) {

        try {
           Parent view = FXMLLoader.load(
                   Cena.class.getResource(fxmlPath)
           );

           rootContainer.getChildren().setAll(view);

        } catch (IOException e) {
            e.printStackTrace();
       }
    }

   
}