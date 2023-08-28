module com {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;
    requires java.sql;

    opens com to javafx.fxml;
    exports com;
    exports com.Controller;
    opens com.Controller to javafx.fxml;
}