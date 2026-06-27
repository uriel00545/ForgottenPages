package com.mycompany.DungeonMaster.controller;

import com.mycompany.DungeonMaster.util.Navegar;
import java.io.IOException;
import javafx.fxml.FXML;

public class InvController {
    
    
    @FXML
    private void fechar() throws IOException {
    Navegar.ir("area");
    }
}
