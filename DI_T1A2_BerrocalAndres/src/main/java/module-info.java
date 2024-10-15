module ieslosmontecillos.ejercicio2 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens ieslosmontecillos.ejercicio2 to javafx.fxml;
    exports ieslosmontecillos.ejercicio2;
}