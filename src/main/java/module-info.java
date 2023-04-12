module com.example.projetointer {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires mysql.connector.j;

    opens com.example.projetointer to javafx.fxml;
    exports com.example.projetointer;
}