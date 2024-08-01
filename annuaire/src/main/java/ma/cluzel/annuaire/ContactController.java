package ma.cluzel.annuaire;

import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class ContactController {

    @FXML
    private String prenom;
    private String nom;
    private String numeroTelephone;

    @Override
    public String toString() {
        return prenom + " " + nom + " : " + numeroTelephone;
    }

    @FXML
    private ListView<Contact> contactListView;

    @FXML
    private TextField prenomField;

    @FXML
    private TextField nomField;

    @FXML
    private TextField numeroTelephoneField;

    public void addContact() {

    }

    public void deleteContact() {
    }

    @FXML
    public void refreshContactList() {
        contactListView.getItems().setAll(ContactRepo.getContacts());
    }
}
