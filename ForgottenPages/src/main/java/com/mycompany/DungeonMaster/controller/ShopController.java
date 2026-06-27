package com.mycompany.DungeonMaster.controller;

import com.mycompany.DungeonMaster.util.Navegar;
import java.io.IOException;
import javafx.fxml.FXML;

public class ShopController {
    
    
    @FXML
    private void voltar() throws IOException {
    Navegar.ir("area.fxml");
    }
}
