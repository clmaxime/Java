module ma.cluzel.calculatrice {
    requires javafx.controls;
    requires javafx.fxml;


    opens ma.cluzel.calculatrice to javafx.fxml;
    exports ma.cluzel.calculatrice;
}