package ma.cluzel.annuaire;

import java.util.ArrayList;
import java.util.List;

public class ContactRepo {

        private static List<Contact> contacts = generateContacts();

        private static List<Contact> generateContacts() {
            return new ArrayList<>(List.of(
                    new Contact("Jean", "Dupont", "0665659201"),
                    new Contact("Test", "test", "0000000000")


            ));
        }

        public static List<Contact> getContacts() {
            return contacts;
        }
    }
