module com.cc.crosshairconverter {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;

    opens com.cc.crosshairconverter to javafx.fxml;
    exports com.cc.crosshairconverter;
}