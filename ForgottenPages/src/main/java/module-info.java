module com.mycompany.DungeonMaster {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.DungeonMaster to javafx.fxml;
    opens com.mycompany.DungeonMaster.controller to javafx.fxml;
    opens com.mycompany.DungeonMaster.model to javafx.fxml;

    exports com.mycompany.DungeonMaster;
    exports com.mycompany.DungeonMaster.controller;
    exports com.mycompany.DungeonMaster.model;
    exports com.mycompany.DungeonMaster.util;
}
