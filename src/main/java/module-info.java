module org.iesmurgi.calculadora {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.iesmurgi.calculadora to javafx.fxml;
    exports org.iesmurgi.calculadora;
}