module ma.cluzel.annuaire {
    requires javafx.controls;
    requires javafx.fxml;


    opens ma.cluzel.annuaire to javafx.fxml;
    exports ma.cluzel.annuaire;
}