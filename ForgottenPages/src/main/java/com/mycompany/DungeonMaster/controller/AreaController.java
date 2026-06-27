package com.mycompany.DungeonMaster.controller;

import com.mycompany.DungeonMaster.model.GameState;
import com.mycompany.DungeonMaster.util.Cena;
import com.mycompany.DungeonMaster.util.Navegar;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

public class AreaController {

    @FXML private AnchorPane AreaCena;
    @FXML private Label lblWaveInfo;

    @FXML
    public void initialize() {
        Cena.setRootContainer(AreaCena);
        Cena.mostrar("/com/mycompany/DungeonMaster/fogueira.fxml");

        
        if (lblWaveInfo != null) {
            GameState gs = GameState.getInstance();
            int wave = gs.getCiclo().getWaveAtual();
            boolean boss = gs.getCiclo().isBossWave();
            lblWaveInfo.setText("Próxima: Wave " + wave + (boss ? " ⚠ BOSS!" : ""));
        }
    }

    @FXML private void tfogueira() {
        Cena.mostrar("/com/mycompany/DungeonMaster/fogueira.fxml");
    }

    @FXML private void tinv() {
        Cena.mostrar("/com/mycompany/DungeonMaster/inv.fxml");
    }

    @FXML private void tLoja() {
        Cena.mostrar("/com/mycompany/DungeonMaster/shop.fxml");
    }

    
    @FXML
    private void irParaBatalha() {
        Navegar.ir("battle");
    }
}
