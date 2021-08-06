module com.example.helloworldfx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires validatorfx;

    opens com.example.helloworldfx to javafx.fxml;
    exports com.example.helloworldfx;
}