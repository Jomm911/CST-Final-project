module com.example.cstfx {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.example.cstfx to javafx.fxml;
    exports com.example.cstfx;
}