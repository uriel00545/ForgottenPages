package com.mycompany.DungeonMaster.util;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class Cena {

    private static AnchorPane rootContainer;

    public static void setRootContainer(AnchorPane container) {
        rootContainer = container;
    }

    public static void mostrar(String caminhoFXML) {
    try {
        System.out.println("Carregando: " + caminhoFXML);

        Parent view = FXMLLoader.load(
            Cena.class.getResource(caminhoFXML)
        );

        System.out.println("FXML carregado com sucesso");

        rootContainer.getChildren().clear();
        rootContainer.getChildren().add(view);

    } catch (Exception e) {
        System.out.println("ERRO AO CARREGAR FXML");
        e.printStackTrace();
    }
}
   
}