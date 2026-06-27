package com.mycompany.DungeonMaster.controller;

import com.mycompany.DungeonMaster.model.GameState;
import com.mycompany.DungeonMaster.model.PlayerFactory;
import com.mycompany.DungeonMaster.util.Navegar;
import javafx.fxml.FXML;

public class MenuController {

    @FXML
    private void jogar() {
        GameState.reset();
        GameState.getInstance().setPlayer(PlayerFactory.criarPadrao());
        Navegar.ir("area");
    }

    @FXML
    private void fecharJogo() {
        System.exit(0);
    }
}
